package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.SituationFamiliale;
import ma.sir.hr.bean.history.SituationFamilialeHistory;
import ma.sir.hr.dao.criteria.core.SituationFamilialeCriteria;
import ma.sir.hr.dao.criteria.history.SituationFamilialeHistoryCriteria;
import ma.sir.hr.dao.facade.core.SituationFamilialeDao;
import ma.sir.hr.dao.facade.history.NotificationHistoryDao;
import ma.sir.hr.dao.specification.core.SituationFamilialeSpecification;
import ma.sir.hr.service.facade.admin.SituationFamilialeAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SituationFamilialeAdminServiceImpl extends AbstractServiceImpl<SituationFamiliale, SituationFamilialeHistory, SituationFamilialeCriteria, SituationFamilialeHistoryCriteria, SituationFamilialeDao,
NotificationHistoryDao> implements SituationFamilialeAdminService {




    public void configure() {
        super.configure(SituationFamiliale.class, SituationFamilialeHistory.class, SituationFamilialeHistoryCriteria.class, SituationFamilialeSpecification.class);
    }

    public SituationFamilialeAdminServiceImpl(SituationFamilialeDao dao, NotificationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}