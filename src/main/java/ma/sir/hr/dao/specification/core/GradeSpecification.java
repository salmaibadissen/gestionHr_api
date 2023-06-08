package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.GradeCriteria;
import ma.sir.hr.bean.core.Grade;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class GradeSpecification extends  AbstractSpecification<GradeCriteria, Grade>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public GradeSpecification(GradeCriteria criteria) {
        super(criteria);
    }

    public GradeSpecification(GradeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
