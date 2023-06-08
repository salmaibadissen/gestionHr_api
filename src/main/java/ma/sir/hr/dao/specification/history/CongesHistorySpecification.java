package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.CongesHistoryCriteria;
import ma.sir.hr.bean.history.CongesHistory;


public class CongesHistorySpecification extends AbstractHistorySpecification<CongesHistoryCriteria, CongesHistory> {

    public CongesHistorySpecification(CongesHistoryCriteria criteria) {
        super(criteria);
    }

    public CongesHistorySpecification(CongesHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
