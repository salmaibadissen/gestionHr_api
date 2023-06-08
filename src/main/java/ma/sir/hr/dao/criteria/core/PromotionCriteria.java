package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.bean.core.Echelle;
import ma.sir.hr.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.util.List;

public class PromotionCriteria extends  BaseCriteria  {

    private GradeCriteria grade;
    private List<GradeCriteria> grades;
  private EchelleCriteria echelle;
    private List<EchelleCriteria> echelles;
    private EchelonCriteria echelon;
    private List<EchelonCriteria> echelons;
    private LocalDateTime dateActivation;
    private LocalDateTime getDateActivationFrom;
    private LocalDateTime dateActivationTo;
    private int indice;
    private EmployeCriteria employe;
     private List<EmployeCriteria> employes;




    public PromotionCriteria(){}


    public GradeCriteria getGrade() {
        return grade;
    }

    public void setGrade(GradeCriteria grade) {
        this.grade = grade;
    }

    public List<GradeCriteria> getGrades() {
        return grades;
    }

    public void setGrades(List<GradeCriteria> grades) {
        this.grades = grades;
    }

    public EchelleCriteria getEchelle() {
        return echelle;
    }

    public void setEchelle(EchelleCriteria echelle) {
        this.echelle = echelle;
    }

    public List<EchelleCriteria> getEchelles() {
        return echelles;
    }

    public void setEchelles(List<EchelleCriteria> echelles) {
        this.echelles = echelles;
    }

    public EchelonCriteria getEchelon() {
        return echelon;
    }

    public void setEchelon(EchelonCriteria echelon) {
        this.echelon = echelon;
    }

    public List<EchelonCriteria> getEchelons() {
        return echelons;
    }

    public void setEchelons(List<EchelonCriteria> echelons) {
        this.echelons = echelons;
    }

    public LocalDateTime getDateActivation() {
        return dateActivation;
    }

    public void setDateActivation(LocalDateTime dateActivation) {
        this.dateActivation = dateActivation;
    }

    public LocalDateTime getGetDateActivationFrom() {
        return getDateActivationFrom;
    }

    public EmployeCriteria getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeCriteria employe) {
        this.employe = employe;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setGetDateActivationFrom(LocalDateTime getDateActivationFrom) {
        this.getDateActivationFrom = getDateActivationFrom;
    }

    public LocalDateTime getDateActivationTo() {
        return dateActivationTo;
    }

    public void setDateActivationTo(LocalDateTime dateActivationTo) {
        this.dateActivationTo = dateActivationTo;
    }

    public List<EmployeCriteria> getEmployes() {
        return employes;
    }

    public void setEmployes(List<EmployeCriteria> employes) {
        this.employes = employes;
    }
}
