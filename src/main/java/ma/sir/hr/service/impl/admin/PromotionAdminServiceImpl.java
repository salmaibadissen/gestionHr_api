package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Promotion;
import ma.sir.hr.bean.history.PromotionHistory;
import ma.sir.hr.dao.criteria.core.PromotionCriteria;
import ma.sir.hr.dao.criteria.history.PromotionHistoryCriteria;
import ma.sir.hr.dao.facade.core.PromotionDao;
import ma.sir.hr.dao.facade.history.PromotionHistoryDao;
import ma.sir.hr.dao.specification.core.PromotionSpecification;
import ma.sir.hr.service.facade.admin.PromotionAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PromotionAdminServiceImpl extends AbstractServiceImpl<Promotion, PromotionHistory, PromotionCriteria, PromotionHistoryCriteria, PromotionDao,
        PromotionHistoryDao> implements PromotionAdminService {


    public Promotion findByReferenceEntity(Promotion t){
        return  dao.findByGradeId(t.getGrade().getId());
    }


    public void configure() {
        super.configure(Promotion.class, PromotionHistory.class, PromotionHistoryCriteria.class, PromotionSpecification.class);
    }

    public PromotionAdminServiceImpl(PromotionDao dao, PromotionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}