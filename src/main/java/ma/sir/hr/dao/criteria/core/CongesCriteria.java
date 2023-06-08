package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.zynerator.criteria.BaseCriteria;

import java.time.Year;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class CongesCriteria extends  BaseCriteria  {

    private LocalDate dateDebut;
    private LocalDate dateDebutFrom;
    private LocalDate dateDebutTo;
    private String duree;
    private String dureeMin;
    private String dureeMax;
    private Year annee;
    private String jourRestantParAnnee;
    private String jourRestantParAnneeMin;
    private String jourRestantParAnneeMax;
    private String status;
    private String statusLike;
    private String numeroAurisation;
    private String numeroAurisationMax;
    private String numeroAurisationMin;
    private LocalDate dateAurisation;
    private EmployeCriteria employe;
    private List<EmployeCriteria> employes;
    public CongesCriteria(){}

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateDebutFrom() {
        return dateDebutFrom;
    }

    public void setDateDebutFrom(LocalDate dateDebutFrom) {
        this.dateDebutFrom = dateDebutFrom;
    }

    public LocalDate getDateDebutTo() {
        return dateDebutTo;
    }

    public void setDateDebutTo(LocalDate dateDebutTo) {
        this.dateDebutTo = dateDebutTo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(String dureeMin) {
        this.dureeMin = dureeMin;
    }

    public String getDureeMax() {
        return dureeMax;
    }

    public void setDureeMax(String dureeMax) {
        this.dureeMax = dureeMax;
    }

    public Year getAnnee() {
        return annee;
    }

    public void setAnnee(Year annee) {
        this.annee = annee;
    }

    public String getNumeroAurisation() {
        return numeroAurisation;
    }

    public void setNumeroAurisation(String numeroAurisation) {
        this.numeroAurisation = numeroAurisation;
    }

    public String getNumeroAurisationMax() {
        return numeroAurisationMax;
    }

    public void setNumeroAurisationMax(String numeroAurisationMax) {
        this.numeroAurisationMax = numeroAurisationMax;
    }

    public String getNumeroAurisationMin() {
        return numeroAurisationMin;
    }

    public void setNumeroAurisationMin(String numeroAurisationMin) {
        this.numeroAurisationMin = numeroAurisationMin;
    }

    public LocalDate getDateAurisation() {
        return dateAurisation;
    }

    public void setDateAurisation(LocalDate dateAurisation) {
        this.dateAurisation = dateAurisation;
    }

    public String getJourRestantParAnnee(){
        return this.jourRestantParAnnee;
    }
    public void setJourRestantParAnnee(String jourRestantParAnnee){
        this.jourRestantParAnnee = jourRestantParAnnee;
    }   
    public String getJourRestantParAnneeMin(){
        return this.jourRestantParAnneeMin;
    }
    public void setJourRestantParAnneeMin(String jourRestantParAnneeMin){
        this.jourRestantParAnneeMin = jourRestantParAnneeMin;
    }
    public String getJourRestantParAnneeMax(){
        return this.jourRestantParAnneeMax;
    }
    public void setJourRestantParAnneeMax(String jourRestantParAnneeMax){
        this.jourRestantParAnneeMax = jourRestantParAnneeMax;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusLike() {
        return statusLike;
    }

    public void setStatusLike(String statusLike) {
        this.statusLike = statusLike;
    }

    public EmployeCriteria getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeCriteria employe) {
        this.employe = employe;
    }

    public List<EmployeCriteria> getEmployes() {
        return employes;
    }

    public void setEmployes(List<EmployeCriteria> employes) {
        this.employes = employes;
    }
}
