package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.SexeHistoryCriteria;
import ma.sir.hr.bean.history.SexeHistory;


public class SexeHistorySpecification extends AbstractHistorySpecification<SexeHistoryCriteria, SexeHistory> {

    public SexeHistorySpecification(SexeHistoryCriteria criteria) {
        super(criteria);
    }

    public SexeHistorySpecification(SexeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
