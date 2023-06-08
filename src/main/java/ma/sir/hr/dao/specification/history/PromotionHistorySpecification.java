package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.PromotionHistoryCriteria;
import ma.sir.hr.bean.history.PromotionHistory;


public class PromotionHistorySpecification extends AbstractHistorySpecification<PromotionHistoryCriteria, PromotionHistory> {

    public PromotionHistorySpecification(PromotionHistoryCriteria criteria) {
        super(criteria);
    }

    public PromotionHistorySpecification(PromotionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
