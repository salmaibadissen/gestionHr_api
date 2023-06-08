package ma.sir.hr.dao.facade.core;

import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Local;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LocalDao extends AbstractRepository<Local,Long>  {

    Local findByLibelle(String libelle);


}
