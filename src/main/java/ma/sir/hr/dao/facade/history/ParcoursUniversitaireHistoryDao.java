package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.ParcoursUniversitaireHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcoursUniversitaireHistoryDao extends AbstractHistoryRepository<ParcoursUniversitaireHistory,Long> {

}
