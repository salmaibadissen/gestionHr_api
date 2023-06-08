package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SituationFamilialeDto extends AuditBaseDto {

    private String reference  ;





    public SituationFamilialeDto(){
        super();
    }



    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }








}
