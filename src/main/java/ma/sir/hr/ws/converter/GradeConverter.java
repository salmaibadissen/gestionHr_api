package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.GradeHistory;
import ma.sir.hr.bean.core.Grade;
import ma.sir.hr.ws.dto.GradeDto;

@Component
public class GradeConverter extends AbstractConverter<Grade, GradeDto, GradeHistory> {


    public  GradeConverter(){
        super(Grade.class, GradeDto.class, GradeHistory.class);
    }

    @Override
    public Grade toItem(GradeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Grade item = new Grade();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public GradeDto toDto(Grade item) {
        if (item == null) {
            return null;
        } else {
            GradeDto dto = new GradeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
