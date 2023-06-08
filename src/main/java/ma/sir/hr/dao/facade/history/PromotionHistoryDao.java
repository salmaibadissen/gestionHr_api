package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.PromotionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionHistoryDao extends AbstractHistoryRepository<PromotionHistory,Long> {

}
