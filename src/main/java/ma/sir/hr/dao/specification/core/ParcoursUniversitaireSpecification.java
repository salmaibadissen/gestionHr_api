package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.ParcoursUniversitaireCriteria;
import ma.sir.hr.bean.core.ParcoursUniversitaire;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ParcoursUniversitaireSpecification extends  AbstractSpecification<ParcoursUniversitaireCriteria, ParcoursUniversitaire>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("deplome", criteria.getDeplome(),criteria.getDeplomeLike());
       // addPredicate("dateObtention", criteria.getDateObtention(), criteria.getDateObtentionFrom(), criteria.getDateObtentionTo());
    }

    public ParcoursUniversitaireSpecification(ParcoursUniversitaireCriteria criteria) {
        super(criteria);
    }

    public ParcoursUniversitaireSpecification(ParcoursUniversitaireCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
