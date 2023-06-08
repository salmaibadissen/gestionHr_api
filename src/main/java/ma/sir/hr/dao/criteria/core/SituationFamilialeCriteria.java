package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;

public class SituationFamilialeCriteria extends  BaseCriteria  {

    private String reference;
    private String referenceLike;



    public SituationFamilialeCriteria(){}

    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getReferenceLike(){
        return this.referenceLike;
    }
    public void setReferenceLike(String referenceLike){
        this.referenceLike = referenceLike;
    }



}
