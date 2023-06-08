package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Echelon;
import ma.sir.hr.bean.history.EchelonHistory;
import ma.sir.hr.dao.criteria.core.EchelonCriteria;
import ma.sir.hr.dao.criteria.history.EchelonHistoryCriteria;
import ma.sir.hr.dao.facade.core.EchelonDao;
import ma.sir.hr.dao.facade.history.EchelonHistoryDao;
import ma.sir.hr.dao.specification.core.EchelonSpecification;
import ma.sir.hr.service.facade.admin.EchelonAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.hr.service.facade.admin.EchelleAdminService ;


import java.util.List;
@Service
public class EchelonAdminServiceImpl extends AbstractServiceImpl<Echelon,EchelonHistory, EchelonCriteria, EchelonHistoryCriteria, EchelonDao,
EchelonHistoryDao> implements EchelonAdminService {


    public Echelon findByReferenceEntity(Echelon t){
        return  dao.findByReference(t.getReference());
    }



    public void configure() {
        super.configure(Echelon.class,EchelonHistory.class, EchelonHistoryCriteria.class, EchelonSpecification.class);
    }

    @Autowired
    private EchelleAdminService echelleService ;
    public EchelonAdminServiceImpl(EchelonDao dao, EchelonHistoryDao historyDao) {
        super(dao, historyDao);
    }

}