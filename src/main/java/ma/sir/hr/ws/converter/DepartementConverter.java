package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.hr.zynerator.util.ListUtil;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.bean.history.DepartementHistory;
import ma.sir.hr.bean.core.Departement;
import ma.sir.hr.ws.dto.DepartementDto;

@Component
public class DepartementConverter extends AbstractConverter<Departement, DepartementDto, DepartementHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private CongesConverter congesConverter ;
    @Autowired
    private NotationConverter notationConverter ;


    @Autowired
    private PromotionConverter gradeConverter ;
    private boolean employe;
    private boolean employes;

    public  DepartementConverter(){
        super(Departement.class, DepartementDto.class, DepartementHistory.class);
        init(true);
    }

    @Override
    public Departement toItem(DepartementDto dto) {
        if (dto == null) {
            return null;
        } else {
        Departement item = new Departement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getDiscription()))
                item.setDiscription(dto.getDiscription());
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;

            if(this.employes && ListUtil.isNotEmpty(dto.getEmployes()))
                item.setEmployes(employeConverter.toItem(dto.getEmployes()));

        return item;
        }
    }

    @Override
    public DepartementDto toDto(Departement item) {
        if (item == null) {
            return null;
        } else {
            DepartementDto dto = new DepartementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getDiscription()))
                dto.setDiscription(item.getDiscription());
        if(this.employe && item.getEmploye()!=null) {
            employeConverter.setDepartement(false);
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
            employeConverter.setDepartement(true);
        }
        if(this.employes && ListUtil.isNotEmpty(item.getEmployes())){
            employeConverter.init(true);
            employeConverter.setDepartement(false);
            dto.setEmployes(employeConverter.toDto(item.getEmployes()));
            employeConverter.setDepartement(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.employes = value;
    }

    public void initObject(boolean value) {
        this.employe = value;
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
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }

    public boolean  isEmployes(){
        return this.employes ;
    }
    public void  setEmployes(boolean employes ){
        this.employes  = employes ;
    }
}
