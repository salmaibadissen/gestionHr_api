package  ma.sir.hr.ws.converter;

import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.CongesHistory;
import ma.sir.hr.bean.core.Conges;
import ma.sir.hr.ws.dto.CongesDto;

import static ma.sir.hr.zynerator.util.DateUtil.convertDatabaseDateToString;
import static ma.sir.hr.zynerator.util.DateUtil.convertLocalDateToString;


@Component
public class CongesConverter extends AbstractConverter<Conges, CongesDto, CongesHistory> {
    @Autowired
    private EmployeConverter employeConverter;
    @Autowired
    private CongesConverter congesConverter ;
    @Autowired
    private NotationConverter notationConverter ;


    @Autowired
    private PromotionConverter gradeConverter ;
    private boolean employe;


    public  CongesConverter(){
        super(Conges.class, CongesDto.class, CongesHistory.class);
    }

    @Override
    public Conges toItem(CongesDto dto) {
        if (dto == null) {
            return null;
        } else {
        Conges item = new Conges();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDateSansTime(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDuree()))
                item.setDuree(dto.getDuree());
            if(StringUtil.isNotEmpty(dto.getNumeroAutorisation()))
                item.setNumeroAutorisation(dto.getNumeroAutorisation());
            if(StringUtil.isNotEmpty(dto.getJourRestantParAnnee()))
                item.setJourRestantParAnnee(dto.getJourRestantParAnnee());
            if(StringUtil.isNotEmpty(dto.getStatus()))
                item.setStatus(dto.getStatus());
            if(StringUtil.isNotEmpty(dto.getDateAutorisation()))
                item.setDateAutorisation(DateUtil.stringEnToDateSansTime(dto.getDateAutorisation()));
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(DateUtil.stringEnToYaer(dto.getAnnee()));
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye()));



            return item;
        }
    }

    @Override
    public CongesDto toDto(Conges item) {
        if (item == null) {
            return null;
        } else {
            CongesDto dto = new CongesDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.convertLocalDateToString(item.getDateDebut()));
            if(StringUtil.isNotEmpty(item.getDuree()))
                dto.setDuree(item.getDuree());
            if(StringUtil.isNotEmpty(item.getNumeroAutorisation()))
                dto.setNumeroAutorisation(item.getNumeroAutorisation());
            if(StringUtil.isNotEmpty(item.getJourRestantParAnnee()))
                dto.setJourRestantParAnnee(item.getJourRestantParAnnee());
            if(StringUtil.isNotEmpty(item.getNumeroAutorisation()))
                dto.setNumeroAutorisation(item.getNumeroAutorisation());
            if(StringUtil.isNotEmpty(item.getStatus()))
                dto.setStatus(item.getStatus());
            if(item.getDateAutorisation()!=null)
                dto.setDateAutorisation(DateUtil.dateToString(item.getDateAutorisation()));
            if(item.getAnnee()!=null)
                dto.setAnnee(DateUtil.yearToString(item.getAnnee()));
            if(this.employe && item.getEmploye()!=null) {
                dto.setEmploye(employeConverter.toDto(item.getEmploye()));
            }

        return dto;
        }
    }
    public void initList(boolean value) {
        // this.employes = value;
    }


    public void initObject(boolean value) {
        this.employe=value;

    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }

    public CongesConverter getCongesConverter(){
        return this.congesConverter;
    }
    public void setCongesConverter(CongesConverter congesConverter ){
        this.congesConverter = congesConverter;
    }
    public NotationConverter getNotationConverter(){
        return this.notationConverter;
    }
    public void setNotationConverter(NotationConverter notationConverter ){
        this.notationConverter = notationConverter;
    }


    public PromotionConverter getGradeConverter(){
        return this.gradeConverter;
    }
    public void setGradeConverter(PromotionConverter gradeConverter ){
        this.gradeConverter = gradeConverter;
    }


    public boolean  isEmploye(){
        return this.employe ;
    }
    public void  setEmploye(boolean employe ){
        this.employe  = employe ;
    }


}
