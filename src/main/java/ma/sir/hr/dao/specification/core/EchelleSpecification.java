package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.EchelleCriteria;
import ma.sir.hr.bean.core.Echelle;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EchelleSpecification extends  AbstractSpecification<EchelleCriteria, Echelle>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
    }

    public EchelleSpecification(EchelleCriteria criteria) {
        super(criteria);
    }

    public EchelleSpecification(EchelleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
