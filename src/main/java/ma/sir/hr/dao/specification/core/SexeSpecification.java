package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.SexeCriteria;
import ma.sir.hr.bean.core.Sexe;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SexeSpecification extends  AbstractSpecification<SexeCriteria, Sexe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public SexeSpecification(SexeCriteria criteria) {
        super(criteria);
    }

    public SexeSpecification(SexeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
