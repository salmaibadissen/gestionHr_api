package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.LocalHistoryCriteria;
import ma.sir.hr.bean.history.LocalHistory;


public class LocalHistorySpecification extends AbstractHistorySpecification<LocalHistoryCriteria, LocalHistory> {

    public LocalHistorySpecification(LocalHistoryCriteria criteria) {
        super(criteria);
    }

    public LocalHistorySpecification(LocalHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
