package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.GradeHistoryCriteria;
import ma.sir.hr.bean.history.GradeHistory;


public class GradeHistorySpecification extends AbstractHistorySpecification<GradeHistoryCriteria, GradeHistory> {

    public GradeHistorySpecification(GradeHistoryCriteria criteria) {
        super(criteria);
    }

    public GradeHistorySpecification(GradeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
