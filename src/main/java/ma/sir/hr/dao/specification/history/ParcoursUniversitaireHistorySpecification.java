package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.ParcoursUniversitaireHistoryCriteria;
import ma.sir.hr.bean.history.ParcoursUniversitaireHistory;


public class ParcoursUniversitaireHistorySpecification extends AbstractHistorySpecification<ParcoursUniversitaireHistoryCriteria, ParcoursUniversitaireHistory> {

    public ParcoursUniversitaireHistorySpecification(ParcoursUniversitaireHistoryCriteria criteria) {
        super(criteria);
    }

    public ParcoursUniversitaireHistorySpecification(ParcoursUniversitaireHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
