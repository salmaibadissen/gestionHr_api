package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.EmployeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeHistoryDao extends AbstractHistoryRepository<EmployeHistory,Long> {

}
