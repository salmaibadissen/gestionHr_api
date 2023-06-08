package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Conges;
import ma.sir.hr.bean.core.Departement;
import ma.sir.hr.bean.history.CongesHistory;
import ma.sir.hr.dao.criteria.core.CongesCriteria;
import ma.sir.hr.dao.criteria.history.CongesHistoryCriteria;
import ma.sir.hr.dao.facade.core.CongesDao;
import ma.sir.hr.dao.facade.history.CongesHistoryDao;
import ma.sir.hr.dao.specification.core.CongesSpecification;
import ma.sir.hr.service.facade.admin.CongesAdminService;
import ma.sir.hr.ws.converter.CongesConverter;
import ma.sir.hr.ws.dto.CongesDto;
import ma.sir.hr.ws.dto.DepartementDto;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;






import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class CongesAdminServiceImpl extends AbstractServiceImpl<Conges,CongesHistory, CongesCriteria, CongesHistoryCriteria, CongesDao,
CongesHistoryDao> implements CongesAdminService {
  public Conges findByEmployeCin(String cin){
      return congesDao.findByEmployeCin(cin);

    }
  public ResponseEntity<CongesDto> save(CongesDto dto) throws Exception {
        // Vérifier si l'employé existe déjà dans la base de données
       // LocalDateTime d1 = DateUtil.stringEnToDate(dto.getDateDebut());
       // LocalDateTime d2 = DateUtil.stringEnToDate(dto.getDateFin());
     //   Duration diff = Duration.between(d1, d2);
        //long daysBetween = DAYS.between(dto.getDateDebut(), dto.getDateFin());
       // if(congesDao.findByEmployeCin(dto.getEmploye().getCin()))
      //  long diffDays = diff.toDays();
        if(22-dto.getDuree()<0){
            throw new Exception("La date de fin est postérieure à la date de début " );

        }
        else if( dto.getDuree()>22){
            throw new Exception("Cet employe n'a pas le droit du congés " );

        }
        else{

            Conges conges = congesConverter.toItem(dto);
            conges = congesDao.save(conges);

            CongesDto responseDto = congesConverter.toDto(conges);
            return ResponseEntity.ok(responseDto);
        }

    }





    public void configure() {
        super.configure(Conges.class,CongesHistory.class, CongesHistoryCriteria.class, CongesSpecification.class);
    }

    public CongesAdminServiceImpl(CongesDao dao, CongesHistoryDao historyDao) {
        super(dao, historyDao);
    }
    @Autowired
    private CongesDao congesDao;
    @Autowired
    private CongesConverter congesConverter;

}