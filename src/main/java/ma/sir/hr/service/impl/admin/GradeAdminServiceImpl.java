package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Grade;
import ma.sir.hr.bean.history.GradeHistory;
import ma.sir.hr.dao.criteria.core.GradeCriteria;
import ma.sir.hr.dao.criteria.history.GradeHistoryCriteria;
import ma.sir.hr.dao.facade.core.GradeDao;
import ma.sir.hr.dao.facade.history.GradeHistoryDao;
import ma.sir.hr.dao.specification.core.GradeSpecification;
import ma.sir.hr.service.facade.admin.GradeAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class GradeAdminServiceImpl extends AbstractServiceImpl<Grade,GradeHistory, GradeCriteria, GradeHistoryCriteria, GradeDao,
GradeHistoryDao> implements GradeAdminService {


    public Grade findByReferenceEntity(Grade t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Grade.class,GradeHistory.class, GradeHistoryCriteria.class, GradeSpecification.class);
    }

    public GradeAdminServiceImpl(GradeDao dao, GradeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}