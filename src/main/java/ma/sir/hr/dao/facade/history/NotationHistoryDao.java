package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.NotationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NotationHistoryDao extends AbstractHistoryRepository<NotationHistory,Long> {

}
