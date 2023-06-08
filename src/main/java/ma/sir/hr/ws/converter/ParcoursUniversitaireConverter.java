package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.ParcoursUniversitaireHistory;
import ma.sir.hr.bean.core.ParcoursUniversitaire;
import ma.sir.hr.ws.dto.ParcoursUniversitaireDto;

@Component
public class ParcoursUniversitaireConverter extends AbstractConverter<ParcoursUniversitaire, ParcoursUniversitaireDto, ParcoursUniversitaireHistory> {


    public  ParcoursUniversitaireConverter(){
        super(ParcoursUniversitaire.class, ParcoursUniversitaireDto.class, ParcoursUniversitaireHistory.class);
    }

    @Override
    public ParcoursUniversitaire toItem(ParcoursUniversitaireDto dto) {
        if (dto == null) {
            return null;
        } else {
        ParcoursUniversitaire item = new ParcoursUniversitaire();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDeplome()))
                item.setDeplome(dto.getDeplome());



        return item;
        }
    }

    @Override
    public ParcoursUniversitaireDto toDto(ParcoursUniversitaire item) {
        if (item == null) {
            return null;
        } else {
            ParcoursUniversitaireDto dto = new ParcoursUniversitaireDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getDeplome()))
                dto.setDeplome(item.getDeplome());



        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
