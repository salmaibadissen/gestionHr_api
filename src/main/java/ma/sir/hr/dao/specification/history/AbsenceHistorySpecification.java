package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.hr.bean.history.AbsenceHistory;


public class AbsenceHistorySpecification extends AbstractHistorySpecification<AbsenceHistoryCriteria, AbsenceHistory> {

    public AbsenceHistorySpecification(AbsenceHistoryCriteria criteria) {
        super(criteria);
    }

    public AbsenceHistorySpecification(AbsenceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
