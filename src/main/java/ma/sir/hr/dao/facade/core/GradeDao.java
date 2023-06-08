package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Grade;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Grade;
import java.util.List;


@Repository
public interface GradeDao extends AbstractRepository<Grade,Long>  {
    Grade findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Grade(item.id,item.libelle) FROM Grade item")
    List<Grade> findAllOptimized();
}
