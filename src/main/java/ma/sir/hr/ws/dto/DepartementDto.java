package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepartementDto  extends AuditBaseDto {

    private String nom  ;
    private String discription  ;

    private EmployeDto employe ;


    private List<EmployeDto> employes ;


    public DepartementDto(){
        super();
    }



    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getDiscription(){
        return this.discription;
    }
    public void setDiscription(String discription){
        this.discription = discription;
    }


   public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }

    public List<EmployeDto> getEmployes(){
        return this.employes;
    }

    public void setEmployes(List<EmployeDto> employes){
        this.employes = employes;
    }

}
