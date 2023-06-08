package ma.sir.hr.dao.facade.core;

import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.ParcoursUniversitaire;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ParcoursUniversitaireDao extends AbstractRepository<ParcoursUniversitaire,Long>  {


}
