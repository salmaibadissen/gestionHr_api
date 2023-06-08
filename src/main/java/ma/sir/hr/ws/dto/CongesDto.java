package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class CongesDto  extends AuditBaseDto {

    private String dateDebut ;
    private long duree ;
    private long jourRestantParAnnee  = 0 ;
    private String status;
    private String annee;
    private long numeroAutorisation  = 0 ;
    private String dateAutorisation;
    private EmployeDto employe;




    public CongesDto(){
        super();
    }



    @Log
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public String getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(String dateDebut){
        this.dateDebut = dateDebut;
    }
    @Log
    public long getDuree() {
        return duree;
    }

    public void setDuree(long duree) {
        this.duree = duree;
    }
    @Log
    @DateTimeFormat(pattern = "yyyy")

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
    @Log
    public long getNumeroAutorisation() {
        return numeroAutorisation;
    }

    public void setNumeroAutorisation(long numeroAutorisation) {
        this.numeroAutorisation = numeroAutorisation;
    }
    @Log
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")

    public String getDateAutorisation() {
        return dateAutorisation;
    }

    public void setDateAutorisation(String dateAutorisation) {
        this.dateAutorisation = dateAutorisation;
    }




    @Log
    public long getJourRestantParAnnee(){
        return this.jourRestantParAnnee;
    }
    public void setJourRestantParAnnee(long jourRestantParAnnee){
        this.jourRestantParAnnee = jourRestantParAnnee;
    }
    @Log

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EmployeDto getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDto employe) {
        this.employe = employe;
    }
}
