package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.LocalHistory;
import ma.sir.hr.bean.core.Local;
import ma.sir.hr.ws.dto.LocalDto;

@Component
public class LocalConverter extends AbstractConverter<Local, LocalDto, LocalHistory> {


    public  LocalConverter(){
        super(Local.class, LocalDto.class, LocalHistory.class);
    }

    @Override
    public Local toItem(LocalDto dto) {
        if (dto == null) {
            return null;
        } else {
        Local item = new Local();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getLocalisation()))
                item.setLocalisation(dto.getLocalisation());

        return item;
        }
    }

    @Override
    public LocalDto toDto(Local item) {
        if (item == null) {
            return null;
        } else {
            LocalDto dto = new LocalDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getLocalisation()))
                dto.setLocalisation(item.getLocalisation());

        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
