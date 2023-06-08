package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.LocalHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalHistoryDao extends AbstractHistoryRepository<LocalHistory,Long> {

}
