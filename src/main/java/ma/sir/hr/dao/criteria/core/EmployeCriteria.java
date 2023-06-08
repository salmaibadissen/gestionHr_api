package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.bean.core.Local;
import ma.sir.hr.bean.core.Sexe;
import ma.sir.hr.bean.core.UserRole;
import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EmployeCriteria extends  BaseCriteria  {

    private String username;
    private String usernameLike;
    private String password;
    private String passwordLike;
    private String prenom;
    private String prenomLike;
    private String nomArabe;
    private String nomArabeLike;
    private String nom;
    private String nomLike;
    private LocalDateTime dateDeNaissance;
    private LocalDateTime dateDeNaissanceFrom;
    private LocalDateTime dateDeNaissanceTo;
    private String lieuDeNaissance;
    private String lieuDeNaissanceLike;
    private SituationFamilialeCriteria situationFamiliale;
    private List<SituationFamilialeCriteria>  situationFamiliales;
    //private SituationFamilialeCriteria situationFamilialeLike;

    private String adresse;
    private String adresseLike;
    private String cin;
    private String cinLike;
    private String tel;
    private String telLike;
    private LocalDateTime dateEmbauche;
    private LocalDateTime dateEmbaucheFrom;
    private LocalDateTime dateEmbaucheTo;
    private String matricule;
    private String matriculeMin;
    private String matriculeMax;
    private String adressEmail;
    private String adressEmailLike;
    private String compteBancaire;
    private String compteBancaireLike;
    private LocalCriteria local;
  //  private String localLike;
    private SexeCriteria sexe ;
    private List<SexeCriteria> sexes;
    private ParcoursUniversitaireCriteria parcoursUniversitaire ;
    private List<ParcoursUniversitaireCriteria> parcoursUniversitaires ;
    private UserRole userRole;

    private DepartementCriteria departement ;
    private List<DepartementCriteria> departements ;
    private String poste ;
    private String posteLike;
    private NotationCriteria notation ;
    private List<NotationCriteria> notations ;
    private List<LocalCriteria> locals ;
    private PromotionCriteria promotion ;
    private List<PromotionCriteria> promotions ;
  /*  private EchelleCriteria echelle ;
    private List<EchelleCriteria> echelles ;
    private EchelonCriteria echelon ;
    private List<EchelonCriteria> echelons ;
    private GradeCriteria grade ;
    private List<GradeCriteria> grades ;*/


    public EmployeCriteria(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernameLike() {
        return usernameLike;
    }

    public void setUsernameLike(String usernameLike) {
        this.usernameLike = usernameLike;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }



    public void setLocals(List<LocalCriteria> locals) {
        this.locals = locals;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPasswordLike(){
        return this.passwordLike;
    }
    public void setPasswordLike(String passwordLike){
        this.passwordLike = passwordLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public LocalDateTime getDateDeNaissance(){
        return this.dateDeNaissance;
    }
    public void setDateDeNaissance(LocalDateTime dateDeNaissance){
        this.dateDeNaissance = dateDeNaissance;
    }
    public LocalDateTime getDateDeNaissanceFrom(){
        return this.dateDeNaissanceFrom;
    }
    public void setDateDeNaissanceFrom(LocalDateTime dateDeNaissanceFrom){
        this.dateDeNaissanceFrom = dateDeNaissanceFrom;
    }
    public LocalDateTime getDateDeNaissanceTo(){
        return this.dateDeNaissanceTo;
    }
    public void setDateDeNaissanceTo(LocalDateTime dateDeNaissanceTo){
        this.dateDeNaissanceTo = dateDeNaissanceTo;
    }
    public String getLieuDeNaissance(){
        return this.lieuDeNaissance;
    }
    public void setLieuDeNaissance(String lieuDeNaissance){
        this.lieuDeNaissance = lieuDeNaissance;
    }
    public String getLieuDeNaissanceLike(){
        return this.lieuDeNaissanceLike;
    }
    public void setLieuDeNaissanceLike(String lieuDeNaissanceLike){
        this.lieuDeNaissanceLike = lieuDeNaissanceLike;
    }

    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getAdresseLike(){
        return this.adresseLike;
    }
    public void setAdresseLike(String adresseLike){
        this.adresseLike = adresseLike;
    }

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCinLike(){
        return this.cinLike;
    }
    public void setCinLike(String cinLike){
        this.cinLike = cinLike;
    }

    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getTelLike(){
        return this.telLike;
    }
    public void setTelLike(String telLike){
        this.telLike = telLike;
    }

    public LocalDateTime getDateEmbauche(){
        return this.dateEmbauche;
    }
    public void setDateEmbauche(LocalDateTime dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }
    public LocalDateTime getDateEmbaucheFrom(){
        return this.dateEmbaucheFrom;
    }
    public void setDateEmbaucheFrom(LocalDateTime dateEmbaucheFrom){
        this.dateEmbaucheFrom = dateEmbaucheFrom;
    }
    public LocalDateTime getDateEmbaucheTo(){
        return this.dateEmbaucheTo;
    }
    public void setDateEmbaucheTo(LocalDateTime dateEmbaucheTo){
        this.dateEmbaucheTo = dateEmbaucheTo;
    }
    public String getMatricule(){
        return this.matricule;
    }
    public void setMatricule(String matricule){
        this.matricule = matricule;
    }   
    public String getMatriculeMin(){
        return this.matriculeMin;
    }
    public void setMatriculeMin(String matriculeMin){
        this.matriculeMin = matriculeMin;
    }
    public String getMatriculeMax(){
        return this.matriculeMax;
    }
    public void setMatriculeMax(String matriculeMax){
        this.matriculeMax = matriculeMax;
    }
      
    public String getAdressEmail(){
        return this.adressEmail;
    }
    public void setAdressEmail(String adressEmail){
        this.adressEmail = adressEmail;
    }
    public String getAdressEmailLike(){
        return this.adressEmailLike;
    }
    public void setAdressEmailLike(String adressEmailLike){
        this.adressEmailLike = adressEmailLike;
    }

    public String getCompteBancaire(){
        return this.compteBancaire;
    }
    public void setCompteBancaire(String compteBancaire){
        this.compteBancaire = compteBancaire;
    }
    public String getCompteBancaireLike(){
        return this.compteBancaireLike;
    }
    public void setCompteBancaireLike(String compteBancaireLike){
        this.compteBancaireLike = compteBancaireLike;
    }

    public LocalCriteria getLocal() {
        return local;
    }

    public void setLocal(LocalCriteria local) {
        this.local = local;
    }

    public SexeCriteria getSexe() {
        return sexe;
    }

    public void setSexe(SexeCriteria sexe) {
        this.sexe = sexe;
    }

    public List<SexeCriteria> getSexes() {
        return sexes;
    }

    public void setSexes(List<SexeCriteria> sexes) {
        this.sexes = sexes;
    }

    public ParcoursUniversitaireCriteria getParcoursUniversitaire() {
        return parcoursUniversitaire;
    }

    public void setParcoursUniversitaire(ParcoursUniversitaireCriteria parcoursUniversitaire) {
        this.parcoursUniversitaire = parcoursUniversitaire;
    }

    public List<ParcoursUniversitaireCriteria> getParcoursUniversitaires() {
        return parcoursUniversitaires;
    }

    public void setParcoursUniversitaires(List<ParcoursUniversitaireCriteria> parcoursUniversitaires) {
        this.parcoursUniversitaires = parcoursUniversitaires;
    }

    public DepartementCriteria getDepartement(){
        return this.departement;
    }

    public void setDepartement(DepartementCriteria departement){
        this.departement = departement;
    }
    public List<DepartementCriteria> getDepartements(){
        return this.departements;
    }

    public void setDepartements(List<DepartementCriteria> departements){
        this.departements = departements;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getPosteLike() {
        return posteLike;
    }

    public void setPosteLike(String posteLike) {
        this.posteLike = posteLike;
    }

    public NotationCriteria getNotation(){
        return this.notation;
    }

    public void setNotation(NotationCriteria notation){
        this.notation = notation;
    }
    public List<NotationCriteria> getNotations(){
        return this.notations;
    }

    public void setNotations(List<NotationCriteria> notations){
        this.notations = notations;
    }

    public PromotionCriteria getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionCriteria promotion) {
        this.promotion = promotion;
    }

    public List<PromotionCriteria> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<PromotionCriteria> promotions) {
        this.promotions = promotions;
    }

    public String getNomArabe() {
        return nomArabe;
    }

    public void setNomArabe(String nomArabe) {
        this.nomArabe = nomArabe;
    }

    public String getNomArabeLike() {
        return nomArabeLike;
    }

    public void setNomArabeLike(String nomArabeLike) {
        this.nomArabeLike = nomArabeLike;
    }

    public SituationFamilialeCriteria getSituationFamiliale() {
        return situationFamiliale;
    }

    public void setSituationFamiliale(SituationFamilialeCriteria situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }

    public List<SituationFamilialeCriteria> getSituationFamiliales() {
        return situationFamiliales;
    }

    public void setSituationFamiliales(List<SituationFamilialeCriteria> situationFamiliales) {
        this.situationFamiliales = situationFamiliales;
    }

    public List<LocalCriteria> getLocals() {
        return locals;
    }
}
