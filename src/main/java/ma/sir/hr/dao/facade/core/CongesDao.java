package ma.sir.hr.dao.facade.core;

import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Conges;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CongesDao extends AbstractRepository<Conges,Long>  {
    Conges findByEmployeCin(String cin);



}
