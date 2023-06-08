package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.LocalCriteria;
import ma.sir.hr.bean.core.Local;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LocalSpecification extends  AbstractSpecification<LocalCriteria, Local>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("localisation", criteria.getLocalisation(), criteria.getLocalisationLike());
    }

    public LocalSpecification(LocalCriteria criteria) {
        super(criteria);
    }

    public LocalSpecification(LocalCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
