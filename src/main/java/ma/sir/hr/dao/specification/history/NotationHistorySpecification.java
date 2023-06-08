package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.NotationHistoryCriteria;
import ma.sir.hr.bean.history.NotationHistory;


public class NotationHistorySpecification extends AbstractHistorySpecification<NotationHistoryCriteria, NotationHistory> {

    public NotationHistorySpecification(NotationHistoryCriteria criteria) {
        super(criteria);
    }

    public NotationHistorySpecification(NotationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
