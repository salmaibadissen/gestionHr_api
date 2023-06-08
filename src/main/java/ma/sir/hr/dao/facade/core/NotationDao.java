package ma.sir.hr.dao.facade.core;

import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Notation;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface NotationDao extends AbstractRepository<Notation,Long>  {


    int deleteByEmployeId(Long id);

   Notation findByEmployeId(Long id);
}
