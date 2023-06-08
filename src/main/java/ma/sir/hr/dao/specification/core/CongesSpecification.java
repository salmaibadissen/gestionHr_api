package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.CongesCriteria;
import ma.sir.hr.bean.core.Conges;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CongesSpecification extends  AbstractSpecification<CongesCriteria, Conges>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
    //   addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
        addPredicateInt("duree", criteria.getDuree(), criteria.getDureeMin(), criteria.getDureeMax());
        addPredicateInt("duree", criteria.getDuree(), criteria.getDureeMin(), criteria.getDureeMax());
        addPredicateInt("numeroAutorisation", criteria.getNumeroAurisation(), criteria.getNumeroAurisationMax(), criteria.getNumeroAurisationMin());
        addPredicateInt("jourRestantParAnnee", criteria.getJourRestantParAnnee(), criteria.getJourRestantParAnneeMin(), criteria.getJourRestantParAnneeMax());
       // addPredicateInt("jourRestantParAnnee", criteria.getJourRestantParAnnee(), criteria.getJourRestantParAnneeMin(), criteria.getJourRestantParAnneeMax());
        addPredicate("status", criteria.getStatus(), criteria.getStatusLike());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());

    }

    public CongesSpecification(CongesCriteria criteria) {
        super(criteria);
    }

    public CongesSpecification(CongesCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
