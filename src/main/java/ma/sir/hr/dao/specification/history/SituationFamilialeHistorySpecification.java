package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.SituationFamilialeHistoryCriteria;
import ma.sir.hr.bean.history.SituationFamilialeHistory;


public class SituationFamilialeHistorySpecification extends AbstractHistorySpecification<SituationFamilialeHistoryCriteria, SituationFamilialeHistory> {

    public SituationFamilialeHistorySpecification(SituationFamilialeHistoryCriteria criteria) {
        super(criteria);
    }

    public SituationFamilialeHistorySpecification(SituationFamilialeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
