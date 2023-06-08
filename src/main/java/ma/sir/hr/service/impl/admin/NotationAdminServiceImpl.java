package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.bean.core.Notation;
import ma.sir.hr.bean.history.NotationHistory;
import ma.sir.hr.dao.criteria.core.NotationCriteria;
import ma.sir.hr.dao.criteria.history.NotationHistoryCriteria;
import ma.sir.hr.dao.facade.core.NotationDao;
import ma.sir.hr.dao.facade.history.NotationHistoryDao;
import ma.sir.hr.dao.specification.core.NotationSpecification;
import ma.sir.hr.service.facade.admin.NotationAdminService;
import ma.sir.hr.ws.converter.NotationConverter;
import ma.sir.hr.ws.dto.EmployeDto;
import ma.sir.hr.ws.dto.NotationDto;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;






import java.util.List;
@Service
public class NotationAdminServiceImpl extends AbstractServiceImpl<Notation,NotationHistory, NotationCriteria, NotationHistoryCriteria, NotationDao,
NotationHistoryDao> implements NotationAdminService {

    public ResponseEntity<NotationDto> save(NotationDto dto) throws Exception {
        LocalDate date = LocalDate.now();
        if(dto.getPremierNote()==null || dto.getDeusiemeNote()==null || dto.getTroisiemeNote()==null || dto.getQuatriemeNote()==null || dto.getCinquiemeNote()==null){
            dto.setPremierNote(BigDecimal.ZERO);
            dto.setDeusiemeNote(BigDecimal.ZERO);
            dto.setTroisiemeNote(BigDecimal.ZERO);
            dto.setQuatriemeNote(BigDecimal.ZERO);
            dto.setCinquiemeNote(BigDecimal.ZERO);
          //  dto.setSommeDesNotes(BigDecimal.ZERO);
            Notation notation= notationConverter.toItem(dto);
            notation = notationDao.save(notation);
            NotationDto responseDto = notationConverter.toDto(notation);
            return ResponseEntity.ok(responseDto);


        }
        if ( dto.getPremierNote().compareTo(new BigDecimal(5))>0 ) {
            throw new Exception("vous avez dépasser l'echelle ");
        }
       if (dto.getDeusiemeNote().compareTo(new BigDecimal(5))>0) {
            throw new Exception("vous avez dépasser l'echelle ");
        }
        if (dto.getTroisiemeNote().compareTo(new BigDecimal(3))>0) {
            throw new Exception("vous avez dépasser l'echelle ");
        }
        if (dto.getQuatriemeNote().compareTo(new BigDecimal(4))>0) {
            throw new Exception("vous avez dépasser l'echelle ");
        }
        if (dto.getCinquiemeNote().compareTo(new BigDecimal(3))>0) {
            throw new Exception("vous avez dépasser l'echelle ");
        }


        else{
            BigDecimal somme = dto.getPremierNote().add(dto.getDeusiemeNote()).add(dto.getTroisiemeNote()).add(dto.getQuatriemeNote()).add(dto.getCinquiemeNote());
           dto.setSommeDesNotes(somme);
           String dateString = date.format(DateTimeFormatter.ISO_DATE);
           // dto.setDateSaisir(dateString);
            Notation notation= notationConverter.toItem(dto);
            notation = notationDao.save(notation);
            NotationDto responseDto = notationConverter.toDto(notation);
            return ResponseEntity.ok(responseDto);
        }
    }



    public void configure() {
        super.configure(Notation.class,NotationHistory.class, NotationHistoryCriteria.class, NotationSpecification.class);
    }

    public NotationAdminServiceImpl(NotationDao dao, NotationHistoryDao historyDao) {
        super(dao, historyDao);
    }

    @Override
    public int deleteByEmployeId(Long id) {
        return dao.deleteByEmployeId(id);
    }

    @Override
    public Notation findByEmployeId(Long id) {
        return dao.findByEmployeId(id);
    }
    @Autowired
    private NotationConverter notationConverter;
    @Autowired
    private NotationDao notationDao;
}