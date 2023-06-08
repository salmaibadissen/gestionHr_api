package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.EchelonHistory;
import ma.sir.hr.bean.core.Echelon;
import ma.sir.hr.ws.dto.EchelonDto;

@Component
public class EchelonConverter extends AbstractConverter<Echelon, EchelonDto, EchelonHistory> {



    public EchelonConverter() {
        super(Echelon.class, EchelonDto.class, EchelonHistory.class);
    }

    @Override
    public Echelon toItem(EchelonDto dto) {
        if (dto == null) {
            return null;
        } else {
            Echelon item = new Echelon();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());

            return item;
        }
    }

    @Override
    public EchelonDto toDto(Echelon item) {
        if (item == null) {
            return null;
        } else {
            EchelonDto dto = new EchelonDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());


            return dto;
        }
    }


    public void initObject(boolean value) {
      //  this.echelle = value;
    }


}
