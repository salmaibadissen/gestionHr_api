package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Echelle;
import ma.sir.hr.bean.history.EchelleHistory;
import ma.sir.hr.dao.criteria.core.EchelleCriteria;
import ma.sir.hr.dao.criteria.history.EchelleHistoryCriteria;
import ma.sir.hr.dao.facade.core.EchelleDao;
import ma.sir.hr.dao.facade.history.EchelleHistoryDao;
import ma.sir.hr.dao.specification.core.EchelleSpecification;
import ma.sir.hr.service.facade.admin.EchelleAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EchelleAdminServiceImpl extends AbstractServiceImpl<Echelle,EchelleHistory, EchelleCriteria, EchelleHistoryCriteria, EchelleDao,
EchelleHistoryDao> implements EchelleAdminService {


    public Echelle findByReferenceEntity(Echelle t){
        return  dao.findByReference(t.getReference());
    }


    public void configure() {
        super.configure(Echelle.class,EchelleHistory.class, EchelleHistoryCriteria.class, EchelleSpecification.class);
    }

    public EchelleAdminServiceImpl(EchelleDao dao, EchelleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}