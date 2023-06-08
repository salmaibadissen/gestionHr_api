package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Promotion;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PromotionDao extends AbstractRepository<Promotion,Long>  {
    Promotion findByGradeId(Long id);
    int deleteByGradeId(Long id);



    @Query("SELECT NEW Promotion(item.id) FROM Promotion item")
    List<Promotion> findAllOptimized();
}
