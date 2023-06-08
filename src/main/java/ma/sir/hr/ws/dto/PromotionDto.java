package  ma.sir.hr.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import ma.sir.hr.bean.core.Echelle;
import ma.sir.hr.bean.core.Echelon;
import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotionDto extends AuditBaseDto {

    private GradeDto grade;
    private EchelleDto echelle;
    private EchelonDto echelon;
    private String dateActivation;
    private int indice;

    private EmployeDto employe;


    public PromotionDto() {
        super();
    }

    @Log
    public GradeDto getGrade() {
        return grade;
    }

    public void setGrade(GradeDto grade) {
        this.grade = grade;
    }




    @Log
    public EchelleDto getEchelle() {
        return echelle;
    }

    public void setEchelle(EchelleDto echelle) {
        this.echelle = echelle;
    }

    @Log
    public EchelonDto getEchelon() {
        return echelon;
    }

    public void setEchelon(EchelonDto echelon) {
        this.echelon = echelon;
    }

    @Log

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateActivation() {
        return dateActivation;
    }

    public void setDateActivation(String dateActivation) {
        this.dateActivation = dateActivation;
    }

    public EmployeDto getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDto employe) {
        this.employe = employe;
    }
}
