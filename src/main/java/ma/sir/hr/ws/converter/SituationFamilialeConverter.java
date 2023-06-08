package  ma.sir.hr.ws.converter;

import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.bean.history.SituationFamilialeHistory;
import ma.sir.hr.bean.core.SituationFamiliale;
import ma.sir.hr.ws.dto.SituationFamilialeDto;

@Component
public class SituationFamilialeConverter extends AbstractConverter<SituationFamiliale, SituationFamilialeDto, SituationFamilialeHistory> {


    public SituationFamilialeConverter(){
        super(SituationFamiliale.class, SituationFamilialeDto.class, SituationFamilialeHistory.class);
    }

    @Override
    public SituationFamiliale toItem(SituationFamilialeDto dto) {
        if (dto == null) {
            return null;
        } else {
        SituationFamiliale item = new SituationFamiliale();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());


        return item;
        }
    }

    @Override
    public SituationFamilialeDto toDto(SituationFamiliale item) {
        if (item == null) {
            return null;
        } else {
            SituationFamilialeDto dto = new SituationFamilialeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
        /*    if(item.getDateNotification()!=null)
                dto.setDateNotification(DateUtil.dateTimeToString(item.getDateNotification()));
*/

        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
