package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.AbsenceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsenceHistoryDao extends AbstractHistoryRepository<AbsenceHistory,Long> {

}
