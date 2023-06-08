package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.EchelleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EchelleHistoryDao extends AbstractHistoryRepository<EchelleHistory,Long> {

}
