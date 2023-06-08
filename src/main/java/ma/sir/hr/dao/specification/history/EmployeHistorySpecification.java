package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.hr.bean.history.EmployeHistory;


public class EmployeHistorySpecification extends AbstractHistorySpecification<EmployeHistoryCriteria, EmployeHistory> {

    public EmployeHistorySpecification(EmployeHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeHistorySpecification(EmployeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
