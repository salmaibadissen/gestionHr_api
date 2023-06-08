package  ma.sir.hr.ws.converter;

import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.ws.dto.EmployeDto;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.bean.history.PromotionHistory;
import ma.sir.hr.bean.core.Promotion;
import ma.sir.hr.ws.dto.PromotionDto;

import java.util.List;

@Component
public class PromotionConverter extends AbstractConverter<Promotion, PromotionDto, PromotionHistory> {

    @Autowired
    private EmployeConverter employeConverter = new EmployeConverter();
    @Autowired
    private EchelleConverter echelleConverter;
    @Autowired
    private EchelonConverter echelonConverter;
    @Autowired
    private GradeConverter gradeConverter;
    private boolean echelle;
    private boolean grade;
    private boolean echelon;
    private boolean employe;
    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }

    public boolean  isEmploye(){
        return this.employe ;
    }
    public void  setEmploye(boolean employes ){
        this.employe  = employe ;
    }

    public EchelleConverter getEchelleConverter() {
        return echelleConverter;
    }

    public void setEchelleConverter(EchelleConverter echelleConverter) {
        this.echelleConverter = echelleConverter;
    }

    public EchelonConverter getEchelonConverter() {
        return echelonConverter;
    }

    public void setEchelonConverter(EchelonConverter echelonConverter) {
        this.echelonConverter = echelonConverter;
    }

    public boolean isEchelle() {
        return echelle;
    }

    public void setEchelle(boolean echelle) {
        this.echelle = echelle;
    }

    public boolean isEchelon() {
        return echelon;
    }

    public void setEchelon(boolean echelon) {
        this.echelon = echelon;
    }

    public GradeConverter getGradeConverter() {
        return gradeConverter;
    }

    public void setGradeConverter(GradeConverter gradeConverter) {
        this.gradeConverter = gradeConverter;
    }

    public boolean isGrade() {
        return grade;
    }

    public void setGrade(boolean grade) {
        this.grade = grade;
    }

    public PromotionConverter(){
        super(Promotion.class, PromotionDto.class, PromotionHistory.class);
    }

    @Override
    public Promotion toItem(PromotionDto dto) {
        if (dto == null) {
            return null;
        } else {
            Promotion item = new Promotion();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(this.grade && dto.getGrade()!=null)
                item.setGrade(gradeConverter.toItem(dto.getGrade())); ;
            if(this.echelle && dto.getEchelle()!=null)
                item.setEchelle(echelleConverter.toItem(dto.getEchelle())); ;

            if(this.echelon && dto.getEchelon()!=null)
                item.setEchelon(echelonConverter.toItem(dto.getEchelon()));
            if (StringUtil.isNotEmpty(dto.getDateActivation()))
                item.setDateActivation(DateUtil.stringEnToDate(dto.getDateActivation()));
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye()));
            if (StringUtil.isNotEmpty(dto.getIndice()))
                item.setIndice(dto.getIndice());

                return item;
            }
        }

    @Override
    public PromotionDto toDto(Promotion item) {
        if (item == null) {
            return null;
        } else {
            PromotionDto dto = new PromotionDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(this.grade && item.getGrade()!=null)
                dto.setGrade(gradeConverter.toDto(item.getGrade()));
            if(this.echelle && item.getEchelle()!=null)
                dto.setEchelle(echelleConverter.toDto(item.getEchelle()));
            if (StringUtil.isNotEmpty(item.getIndice()))
                dto.setIndice(item.getIndice());

            if(this.echelon && item.getEchelon()!=null)
                dto.setEchelon(echelonConverter.toDto(item.getEchelon()));
            if(item.getDateActivation()!=null)
                dto.setDateActivation(DateUtil.dateTimeToString(item.getDateActivation()));
            if(this.employe && item.getEmploye()!=null) {
                dto.setEmploye(employeConverter.toDto(item.getEmploye()));
            }
            return dto;
        }
    }
    public void initList(boolean value) {
    }

    public void initObject(boolean value) {
        this.echelle = value;
        this.echelon=value;
        this.grade=value;
        this.employe=value;
    }


}
