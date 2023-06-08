package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.EchelleHistory;
import ma.sir.hr.bean.core.Echelle;
import ma.sir.hr.ws.dto.EchelleDto;

@Component
public class EchelleConverter extends AbstractConverter<Echelle, EchelleDto, EchelleHistory> {



    public  EchelleConverter(){
        super(Echelle.class, EchelleDto.class, EchelleHistory.class);
    }

    @Override
    public Echelle toItem(EchelleDto dto) {
        if (dto == null) {
            return null;
        } else {
        Echelle item = new Echelle();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());

        return item;
        }
    }

    @Override
    public EchelleDto toDto(Echelle item) {
        if (item == null) {
            return null;
        } else {
            EchelleDto dto = new EchelleDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());

        return dto;
        }
    }


    public void initObject(boolean value) {
    }



}
