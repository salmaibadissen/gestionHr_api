package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;

public class DepartementCriteria extends  BaseCriteria  {

    private String nom;
    private String nomLike;
    private String discription;
    private String discriptionLike;

    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;


    public DepartementCriteria(){}

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

    public String getDiscription(){
        return this.discription;
    }
    public void setDiscription(String discription){
        this.discription = discription;
    }
    public String getDiscriptionLike(){
        return this.discriptionLike;
    }
    public void setDiscriptionLike(String discriptionLike){
        this.discriptionLike = discriptionLike;
    }


    public EmployeCriteria getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeCriteria employe){
        this.employe = employe;
    }
    public List<EmployeCriteria> getEmployes(){
        return this.employes;
    }

    public void setEmployes(List<EmployeCriteria> employes){
        this.employes = employes;
    }
}
