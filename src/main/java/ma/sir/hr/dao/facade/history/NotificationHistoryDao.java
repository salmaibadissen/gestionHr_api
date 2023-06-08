package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.SituationFamilialeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationHistoryDao extends AbstractHistoryRepository<SituationFamilialeHistory,Long> {

}
