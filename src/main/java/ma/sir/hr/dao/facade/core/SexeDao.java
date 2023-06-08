package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Sexe;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Sexe;
import java.util.List;


@Repository
public interface SexeDao extends AbstractRepository<Sexe,Long>  {
    Sexe findByReference(String reference);
    int deleteByReference(String reference);


    @Query("SELECT NEW Sexe(item.id,item.libelle) FROM Sexe item")
    List<Sexe> findAllOptimized();
}
