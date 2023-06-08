package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.bean.history.AbsenceHistory;
import ma.sir.hr.dao.criteria.core.AbsenceCriteria;
import ma.sir.hr.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.hr.dao.facade.core.AbsenceDao;
import ma.sir.hr.dao.facade.history.AbsenceHistoryDao;
import ma.sir.hr.dao.specification.core.AbsenceSpecification;
import ma.sir.hr.service.facade.admin.AbsenceAdminService;
import ma.sir.hr.ws.dto.AbsenceDto;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;






import java.util.List;
@Service
public class AbsenceAdminServiceImpl extends AbstractServiceImpl<Absence,AbsenceHistory, AbsenceCriteria, AbsenceHistoryCriteria, AbsenceDao,
AbsenceHistoryDao> implements AbsenceAdminService {


    private final AbsenceDao absenceDao;

    public void configure() {
        super.configure(Absence.class,AbsenceHistory.class, AbsenceHistoryCriteria.class, AbsenceSpecification.class);
    }

    public AbsenceAdminServiceImpl(AbsenceDao dao, AbsenceHistoryDao historyDao,
                                   AbsenceDao absenceDao) {
        super(dao, historyDao);
        this.absenceDao = absenceDao;
    }

    @Override
    public int deleteByEmployeId(Long id) {
        return dao.deleteByEmployeId(id);
    }

    @Override
    public List<Absence> findByEmployeId(Long id) {
        return dao.findByEmployeId(id);
    }

}