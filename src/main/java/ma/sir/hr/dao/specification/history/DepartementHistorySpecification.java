package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.hr.bean.history.DepartementHistory;


public class DepartementHistorySpecification extends AbstractHistorySpecification<DepartementHistoryCriteria, DepartementHistory> {

    public DepartementHistorySpecification(DepartementHistoryCriteria criteria) {
        super(criteria);
    }

    public DepartementHistorySpecification(DepartementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
