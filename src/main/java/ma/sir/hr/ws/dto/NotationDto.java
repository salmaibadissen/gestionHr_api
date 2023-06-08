package  ma.sir.hr.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotationDto  extends AuditBaseDto {

    private BigDecimal premierNote  ;
    private BigDecimal deusiemeNote  ;
    private BigDecimal troisiemeNote  ;
    private BigDecimal quatriemeNote  ;
    private BigDecimal cinquiemeNote  ;
    private BigDecimal sommeDesNotes  ;
    private String annee  ;
    private EmployeDto employe ;




    public NotationDto(){
        super();
    }



    @Log
    public BigDecimal getPremierNote(){
        return this.premierNote;
    }
    public void setPremierNote(BigDecimal premierNote){
        this.premierNote = premierNote;
    }

    @Log
    public BigDecimal getDeusiemeNote(){
        return this.deusiemeNote;
    }
    public void setDeusiemeNote(BigDecimal deusiemeNote){
        this.deusiemeNote = deusiemeNote;
    }

    @Log
    public BigDecimal getTroisiemeNote(){
        return this.troisiemeNote;
    }
    public void setTroisiemeNote(BigDecimal troisiemeNote){
        this.troisiemeNote = troisiemeNote;
    }

    @Log
    public BigDecimal getQuatriemeNote(){
        return this.quatriemeNote;
    }
    public void setQuatriemeNote(BigDecimal quatriemeNote){
        this.quatriemeNote = quatriemeNote;
    }

    @Log
    public BigDecimal getCinquiemeNote(){
        return this.cinquiemeNote;
    }
    public void setCinquiemeNote(BigDecimal cinquiemeNote){
        this.cinquiemeNote = cinquiemeNote;
    }

    @Log
    public BigDecimal getSommeDesNotes(){
        return this.sommeDesNotes;
    }
    public void setSommeDesNotes(BigDecimal sommeDesNotes){
        this.sommeDesNotes = sommeDesNotes;
    }
 @Log
 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy")
    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Log

    public EmployeDto getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDto employe) {
        this.employe = employe;
    }
}
