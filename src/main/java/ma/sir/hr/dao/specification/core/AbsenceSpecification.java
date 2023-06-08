package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.AbsenceCriteria;
import ma.sir.hr.bean.core.Absence;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AbsenceSpecification extends  AbstractSpecification<AbsenceCriteria, Absence>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateAbsence", criteria.getDateAbsence(), criteria.getDateAbsenceFrom(), criteria.getDateAbsenceTo());
        addPredicate("justification", criteria.getJustification(),criteria.getJustificationLike());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employes","id", criteria.getEmployes());

    }

    public AbsenceSpecification(AbsenceCriteria criteria) {
        super(criteria);
    }

    public AbsenceSpecification(AbsenceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
