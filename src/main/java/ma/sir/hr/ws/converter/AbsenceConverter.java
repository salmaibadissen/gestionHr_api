package  ma.sir.hr.ws.converter;

import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.AbsenceHistory;
import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.ws.dto.AbsenceDto;

@Component
public class AbsenceConverter extends AbstractConverter<Absence, AbsenceDto, AbsenceHistory> {
    @Autowired
    private EmployeConverter employeConverter ;
    private boolean employe;


    public  AbsenceConverter(){
        super(Absence.class, AbsenceDto.class, AbsenceHistory.class);
    }

    @Override
    public Absence toItem(AbsenceDto dto) {
        if (dto == null) {
            return null;
        } else {
        Absence item = new Absence();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateAbsence()))
                item.setDateAbsence(DateUtil.stringEnToDate(dto.getDateAbsence()));
            if(StringUtil.isNotEmpty(dto.getJustification()))
                item.setJustification(dto.getJustification());
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye()));





            return item;
        }
    }
    public void initList(boolean value) {

    }

    @Override
    public AbsenceDto toDto(Absence item) {
        if (item == null) {
            return null;
        } else {
            AbsenceDto dto = new AbsenceDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());

            if(item.getDateAbsence()!=null)
                dto.setDateAbsence(DateUtil.dateTimeToString(item.getDateAbsence()));
            if(StringUtil.isNotEmpty(item.getJustification()))
                dto.setJustification(item.getJustification());
            if(this.employe && item.getEmploye()!=null) {
                dto.setEmploye(employeConverter.toDto(item.getEmploye()));
            }


        return dto;
        }
    }
    public void initObject(boolean value) {
        this.employe=value;

    }

    public EmployeConverter getEmployeConverter() {
        return employeConverter;
    }

    public void setEmployeConverter(EmployeConverter employeConverter) {
        this.employeConverter = employeConverter;
    }

    public boolean isEmploye() {
        return employe;
    }

    public void setEmploye(boolean employes) {
        this.employe= employe;
    }
}
