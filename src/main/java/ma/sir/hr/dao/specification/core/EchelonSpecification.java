package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.EchelonCriteria;
import ma.sir.hr.bean.core.Echelon;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EchelonSpecification extends  AbstractSpecification<EchelonCriteria, Echelon>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
    }

    public EchelonSpecification(EchelonCriteria criteria) {
        super(criteria);
    }

    public EchelonSpecification(EchelonCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
