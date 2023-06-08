package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Echelon;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Echelon;
import java.util.List;


@Repository
public interface EchelonDao extends AbstractRepository<Echelon,Long>  {
    Echelon findByReference(String reference);
    int deleteByReference(String reference);

    @Query("SELECT NEW Echelon(item.id,item.reference) FROM Echelon item")
    List<Echelon> findAllOptimized();
}
