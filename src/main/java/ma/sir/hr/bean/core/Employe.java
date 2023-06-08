package ma.sir.hr.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "employe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="employe_seq",sequenceName="employe_seq",allocationSize=1, initialValue = 1)
public class Employe   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String username;
    @Column(length = 500)
    private String password;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String nomArabe;
    private LocalDateTime dateDeNaissance ;
    @Column(length = 500)
    private String lieuDeNaissance;
    @Column(length = 500)
    private String adresse;
    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String tel;
    private LocalDateTime dateEmbauche ;
    private Integer matricule = 0;
    @Column(length = 500)
    private String adressEmail;
    @Column(length = 500)
    private String compteBancaire;
    private String poste;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    private Local local ;

    private Sexe sexe ;
    
    private ParcoursUniversitaire parcoursUniversitaire ;
    private SituationFamiliale situationFamiliale;
    
    private Departement departement ;
    
    private Notation notation ;
    
    private Promotion promotion;
    private Absence absence;




    public Employe(){
        super();
    }

    public Employe(Long id,String password){
        this.id = id;
        this.password = password ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="employe_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNomArabe() {
        return nomArabe;
    }

    public void setNomArabe(String nomArabe) {
        this.nomArabe = nomArabe;
    }

    public LocalDateTime getDateDeNaissance(){
        return this.dateDeNaissance;
    }
    public void setDateDeNaissance(LocalDateTime dateDeNaissance){
        this.dateDeNaissance = dateDeNaissance;
    }
    public String getLieuDeNaissance(){
        return this.lieuDeNaissance;
    }
    public void setLieuDeNaissance(String lieuDeNaissance){
        this.lieuDeNaissance = lieuDeNaissance;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    @ManyToOne(fetch = FetchType.LAZY)

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parcoursUniversitaire_id")
    public ParcoursUniversitaire getParcoursUniversitaire() {
        return parcoursUniversitaire;
    }

    public void setParcoursUniversitaire(ParcoursUniversitaire parcoursUniversitaire) {
        this.parcoursUniversitaire = parcoursUniversitaire;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public LocalDateTime getDateEmbauche(){
        return this.dateEmbauche;
    }
    public void setDateEmbauche(LocalDateTime dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }
    public Integer getMatricule(){
        return this.matricule;
    }
    public void setMatricule(Integer matricule){
        this.matricule = matricule;
    }
    public String getAdressEmail(){
        return this.adressEmail;
    }
    public void setAdressEmail(String adressEmail){
        this.adressEmail = adressEmail;
    }
    public String getCompteBancaire(){
        return this.compteBancaire;
    }
    public void setCompteBancaire(String compteBancaire){
        this.compteBancaire = compteBancaire;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "situationfamiliale_id")
    public SituationFamiliale getSituationFamiliale() {
        return this.situationFamiliale;
    }

    public void setSituationFamiliale(SituationFamiliale situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departement_id")
    public Departement getDepartement(){
        return this.departement;
    }
    public void setDepartement(Departement departement){
        this.departement = departement;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Notation getNotation(){
        return this.notation;
    }
    public void setNotation(Notation notation){
        this.notation = notation;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Promotion getPromotion(){
        return this.promotion;
    }
    public void setPromotion(Promotion promotion){
        this.promotion = promotion;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "local_id")
    public Local getLocal(){
        return this.local;
    }
    public void setLocal(Local local){
        this.local = local;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
    @ManyToOne
    @JoinColumn(name = "absence_id")

    public Absence getAbsence() {
        return absence;
    }

    public void setAbsence(Absence absence) {
        this.absence = absence;
    }

    @Transient
    public String getLabel() {
        label = password;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id != null && id.equals(employe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

