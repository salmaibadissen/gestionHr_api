package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Local;
import ma.sir.hr.bean.history.LocalHistory;
import ma.sir.hr.dao.criteria.core.LocalCriteria;
import ma.sir.hr.dao.criteria.history.LocalHistoryCriteria;
import ma.sir.hr.dao.facade.core.LocalDao;
import ma.sir.hr.dao.facade.history.LocalHistoryDao;
import ma.sir.hr.dao.specification.core.LocalSpecification;
import ma.sir.hr.service.facade.admin.LocalAdminService;
import ma.sir.hr.ws.converter.LocalConverter;
import ma.sir.hr.ws.dto.LocalDto;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LocalAdminServiceImpl extends AbstractServiceImpl<Local,LocalHistory, LocalCriteria, LocalHistoryCriteria, LocalDao,
LocalHistoryDao> implements LocalAdminService {
    @Autowired
    private final LocalDao localDao;
    @Autowired
    private LocalConverter localConverter;
    public Local findByLibelle(String libelle){return localDao.findByLibelle(libelle);}



    public ResponseEntity<LocalDto> save(LocalDto dto) throws Exception {
        if (findByLibelle((dto.getLibelle()))!=null) {
            throw new Exception("Local avec le Libelle " + dto.getLibelle() + " existe déjà");
        }
        else{
            Local local = localConverter.toItem(dto);
            local = localDao.save(local);
            // Convertir l'employé en DTO de réponse
            LocalDto reponseDto = localConverter.toDto(local);

            // Retourner la réponse avec un statut 200 OK
            return ResponseEntity.ok(reponseDto);
        }

       /* if (dto.getLibelle() !=null){

        }*/


    }




    public void configure() {
        super.configure(Local.class,LocalHistory.class, LocalHistoryCriteria.class, LocalSpecification.class);
    }

    public LocalAdminServiceImpl(LocalDao dao, LocalHistoryDao historyDao,
                                 LocalDao localDao) {
        super(dao, historyDao);
        this.localDao = localDao;
    }

}