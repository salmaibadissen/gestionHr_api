package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class LocalCriteria extends  BaseCriteria  {

    private String libelle;
    private String libelleLike;
    private String localisation;
    private String localisationLike;



    public LocalCriteria(){}

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getLocalisationLike() {
        return localisationLike;
    }

    public void setLocalisationLike(String localisationLike) {
        this.localisationLike = localisationLike;
    }
}
