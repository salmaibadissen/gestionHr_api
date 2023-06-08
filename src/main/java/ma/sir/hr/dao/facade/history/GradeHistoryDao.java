package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.GradeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeHistoryDao extends AbstractHistoryRepository<GradeHistory,Long> {

}
