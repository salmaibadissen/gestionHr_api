package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class AbsenceCriteria extends  BaseCriteria  {

    private LocalDateTime dateAbsence;
    private LocalDateTime dateAbsenceFrom;
    private LocalDateTime dateAbsenceTo;
    private String justification;
    private String justificationLike;
    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;



    public AbsenceCriteria(){}

      
    public LocalDateTime getDateAbsence(){
        return this.dateAbsence;
    }
    public void setDateAbsence(LocalDateTime dateAbsence){
        this.dateAbsence = dateAbsence;
    }
    public LocalDateTime getDateAbsenceFrom(){
        return this.dateAbsenceFrom;
    }
    public void setDateAbsenceFrom(LocalDateTime dateAbsenceFrom){
        this.dateAbsenceFrom = dateAbsenceFrom;
    }
    public LocalDateTime getDateAbsenceTo(){
        return this.dateAbsenceTo;
    }
    public void setDateAbsenceTo(LocalDateTime dateAbsenceTo){
        this.dateAbsenceTo = dateAbsenceTo;
    }
    public String getJustification(){
        return this.justification;
    }
    public void setJustification(String justification){
        this.justification = justification;
    }
    public String getJustificationLike(){
        return this.justificationLike;
    }
    public void setJustificationLike(String justificationLike){
        this.justificationLike = justificationLike;
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
