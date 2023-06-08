package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.EchelonHistoryCriteria;
import ma.sir.hr.bean.history.EchelonHistory;


public class EchelonHistorySpecification extends AbstractHistorySpecification<EchelonHistoryCriteria, EchelonHistory> {

    public EchelonHistorySpecification(EchelonHistoryCriteria criteria) {
        super(criteria);
    }

    public EchelonHistorySpecification(EchelonHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
