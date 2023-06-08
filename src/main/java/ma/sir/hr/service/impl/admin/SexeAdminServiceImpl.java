package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Sexe;
import ma.sir.hr.bean.history.SexeHistory;
import ma.sir.hr.dao.criteria.core.SexeCriteria;
import ma.sir.hr.dao.criteria.history.SexeHistoryCriteria;
import ma.sir.hr.dao.facade.core.SexeDao;
import ma.sir.hr.dao.facade.history.SexeHistoryDao;
import ma.sir.hr.dao.specification.core.SexeSpecification;
import ma.sir.hr.service.facade.admin.SexeAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SexeAdminServiceImpl extends AbstractServiceImpl<Sexe,SexeHistory, SexeCriteria, SexeHistoryCriteria, SexeDao,
SexeHistoryDao> implements SexeAdminService {


    public Sexe findByReferenceEntity(Sexe t){
        return  dao.findByReference(t.getReference());
    }


    public void configure() {
        super.configure(Sexe.class,SexeHistory.class, SexeHistoryCriteria.class, SexeSpecification.class);
    }

    public SexeAdminServiceImpl(SexeDao dao, SexeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}