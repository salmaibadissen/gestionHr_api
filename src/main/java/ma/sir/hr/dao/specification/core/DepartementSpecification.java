package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.DepartementCriteria;
import ma.sir.hr.bean.core.Departement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DepartementSpecification extends  AbstractSpecification<DepartementCriteria, Departement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("discription", criteria.getDiscription(),criteria.getDiscriptionLike());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
       addPredicateFk("employe","password", criteria.getEmploye()==null?null:criteria.getEmploye().getPassword());
    }

    public DepartementSpecification(DepartementCriteria criteria) {
        super(criteria);
    }

    public DepartementSpecification(DepartementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
