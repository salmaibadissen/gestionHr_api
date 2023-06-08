package  ma.sir.hr.ws.dto;

import ma.sir.hr.bean.core.Local;
import ma.sir.hr.bean.core.Sexe;
import ma.sir.hr.bean.core.UserRole;
import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeDto  extends AuditBaseDto {

    private String username  ;
    private String password  ;
    private String prenom  ;
    private String nom  ;
    private String nomArabe;
    private String dateDeNaissance ;
    private String lieuDeNaissance  ;
    private String adresse  ;
    private String cin  ;
    private String tel  ;
    private SituationFamilialeDto situationFamiliale  ;
    private String dateEmbauche ;
    private Integer matricule  = 0 ;
    private String adressEmail  ;
    private String compteBancaire  ;
    private LocalDto local  ;
    private UserRole userRole;

    private SexeDto sexe ;
    private ParcoursUniversitaireDto parcoursUniversitaire ;
    private DepartementDto departement ;
    private String poste ;
    private NotationDto notation ;
    private PromotionDto promotion ;





    public EmployeDto(){
        super();
    }

    @Log

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
@Log
    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }


    @Log
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDeNaissance(){
        return this.dateDeNaissance;
    }
    public void setDateDeNaissance(String dateDeNaissance){
        this.dateDeNaissance = dateDeNaissance;
    }

    @Log
    public String getLieuDeNaissance(){
        return this.lieuDeNaissance;
    }
    public void setLieuDeNaissance(String lieuDeNaissance){
        this.lieuDeNaissance = lieuDeNaissance;
    }

    @Log
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    @Log
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }

    @Log
    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEmbauche(){
        return this.dateEmbauche;
    }
    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }

    @Log
    public Integer getMatricule(){
        return this.matricule;
    }
    public void setMatricule(Integer matricule){
        this.matricule = matricule;
    }

    @Log
    public String getAdressEmail(){
        return this.adressEmail;
    }
    public void setAdressEmail(String adressEmail){
        this.adressEmail = adressEmail;
    }

    @Log
    public String getCompteBancaire(){
        return this.compteBancaire;
    }
    public void setCompteBancaire(String compteBancaire){
        this.compteBancaire = compteBancaire;
    }
    @Log
    public ParcoursUniversitaireDto getParcoursUniversitaire() {
        return parcoursUniversitaire;
    }

    public void setParcoursUniversitaire(ParcoursUniversitaireDto parcoursUniversitaire) {
        this.parcoursUniversitaire = parcoursUniversitaire;
    }


    @Log

    public LocalDto getLocal() {
        return local;
    }

    public void setLocal(LocalDto local) {
        this.local = local;
    }



    @Log
    public SexeDto getSexe() {
        return sexe;
    }

    public void setSexe(SexeDto sexe) {
        this.sexe = sexe;
    }
   @Log
    public DepartementDto getDepartement(){
        return this.departement;
    }

    public void setDepartement(DepartementDto departement){
        this.departement = departement;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public NotationDto getNotation(){
        return this.notation;
    }

    public void setNotation(NotationDto notation){
        this.notation = notation;
    }

    public PromotionDto getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionDto promotion) {
        this.promotion = promotion;
    }
   /*  public EchelleDto getEchelle(){
        return this.echelle;
    }

    public void setEchelle(EchelleDto echelle){
        this.echelle = echelle;
    }
    public EchelonDto getEchelon(){
        return this.echelon;
    }

    public void setEchelon(EchelonDto echelon){
        this.echelon = echelon;
    }
    public GradeDto getGrade(){
        return this.grade;
    }

    public void setGrade(GradeDto grade){
        this.grade = grade;
    }
*/

    public String getNomArabe() {
        return nomArabe;
    }

    public void setNomArabe(String nomArabe) {
        this.nomArabe = nomArabe;
    }

    public SituationFamilialeDto getSituationFamiliale() {
        return situationFamiliale;
    }

    public void setSituationFamiliale(SituationFamilialeDto situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }
}
