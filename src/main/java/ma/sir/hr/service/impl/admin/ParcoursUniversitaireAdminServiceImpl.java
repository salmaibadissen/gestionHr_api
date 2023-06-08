package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.ParcoursUniversitaire;
import ma.sir.hr.bean.history.ParcoursUniversitaireHistory;
import ma.sir.hr.dao.criteria.core.ParcoursUniversitaireCriteria;
import ma.sir.hr.dao.criteria.history.ParcoursUniversitaireHistoryCriteria;
import ma.sir.hr.dao.facade.core.ParcoursUniversitaireDao;
import ma.sir.hr.dao.facade.history.ParcoursUniversitaireHistoryDao;
import ma.sir.hr.dao.specification.core.ParcoursUniversitaireSpecification;
import ma.sir.hr.service.facade.admin.ParcoursUniversitaireAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ParcoursUniversitaireAdminServiceImpl extends AbstractServiceImpl<ParcoursUniversitaire,ParcoursUniversitaireHistory, ParcoursUniversitaireCriteria, ParcoursUniversitaireHistoryCriteria, ParcoursUniversitaireDao,
ParcoursUniversitaireHistoryDao> implements ParcoursUniversitaireAdminService {




    public void configure() {
        super.configure(ParcoursUniversitaire.class,ParcoursUniversitaireHistory.class, ParcoursUniversitaireHistoryCriteria.class, ParcoursUniversitaireSpecification.class);
    }

    public ParcoursUniversitaireAdminServiceImpl(ParcoursUniversitaireDao dao, ParcoursUniversitaireHistoryDao historyDao) {
        super(dao, historyDao);
    }

}