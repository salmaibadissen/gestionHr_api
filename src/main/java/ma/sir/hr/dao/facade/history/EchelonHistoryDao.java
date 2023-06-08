package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.EchelonHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EchelonHistoryDao extends AbstractHistoryRepository<EchelonHistory,Long> {

}
