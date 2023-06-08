package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Echelle;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Echelle;
import java.util.List;


@Repository
public interface EchelleDao extends AbstractRepository<Echelle,Long>  {
    Echelle findByReference(String reference);
    int deleteByReference(String reference);



    @Query("SELECT NEW Echelle(item.id,item.reference) FROM Echelle item")
    List<Echelle> findAllOptimized();
}
