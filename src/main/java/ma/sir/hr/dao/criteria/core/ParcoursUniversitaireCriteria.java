package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class ParcoursUniversitaireCriteria extends  BaseCriteria  {

    private String deplome;
    private String deplomeLike;




    public ParcoursUniversitaireCriteria(){}

    public String getDeplome(){
        return this.deplome;
    }
    public void setDeplome(String deplome){
        this.deplome = deplome;
    }
    public String getDeplomeLike(){
        return this.deplomeLike;
    }
    public void setDeplomeLike(String deplomeLike){
        this.deplomeLike = deplomeLike;
    }



}
