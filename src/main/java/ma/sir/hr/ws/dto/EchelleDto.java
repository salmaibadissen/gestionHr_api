package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EchelleDto  extends AuditBaseDto {

    private String reference  ;
    private String dateActivation ;

    private EchelleDto echelle ;



    public EchelleDto(){
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateActivation(){
        return this.dateActivation;
    }
    public void setDateActivation(String dateActivation){
        this.dateActivation = dateActivation;
    }


    public EchelleDto getEchelle(){
        return this.echelle;
    }

    public void setEchelle(EchelleDto echelle){
        this.echelle = echelle;
    }




}
