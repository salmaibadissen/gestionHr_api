package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class EchelonDto  extends AuditBaseDto {

    private String reference  ;
    private Integer indice  = 0 ;

    private EchelleDto echelle ;



    public EchelonDto(){
        super();
    }



    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    public Integer getIndice(){
        return this.indice;
    }
    public void setIndice(Integer indice){
        this.indice = indice;
    }


    public EchelleDto getEchelle(){
        return this.echelle;
    }

    public void setEchelle(EchelleDto echelle){
        this.echelle = echelle;
    }




}
