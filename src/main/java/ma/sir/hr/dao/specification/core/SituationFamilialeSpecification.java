package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.SituationFamilialeCriteria;
import ma.sir.hr.bean.core.SituationFamiliale;

public class SituationFamilialeSpecification extends  AbstractSpecification<SituationFamilialeCriteria, SituationFamiliale>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
    }

    public SituationFamilialeSpecification(SituationFamilialeCriteria criteria) {
        super(criteria);
    }

    public SituationFamilialeSpecification(SituationFamilialeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
