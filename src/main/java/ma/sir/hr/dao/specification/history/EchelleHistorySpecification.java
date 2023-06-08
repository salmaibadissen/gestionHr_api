package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.EchelleHistoryCriteria;
import ma.sir.hr.bean.history.EchelleHistory;


public class EchelleHistorySpecification extends AbstractHistorySpecification<EchelleHistoryCriteria, EchelleHistory> {

    public EchelleHistorySpecification(EchelleHistoryCriteria criteria) {
        super(criteria);
    }

    public EchelleHistorySpecification(EchelleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
