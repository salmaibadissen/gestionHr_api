package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.NotationCriteria;
import ma.sir.hr.bean.core.Notation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class NotationSpecification extends  AbstractSpecification<NotationCriteria, Notation>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("premierNote", criteria.getPremierNote(), criteria.getPremierNoteMin(), criteria.getPremierNoteMax());
        addPredicateBigDecimal("deusiemeNote", criteria.getDeusiemeNote(), criteria.getDeusiemeNoteMin(), criteria.getDeusiemeNoteMax());
        addPredicateBigDecimal("troisiemeNote", criteria.getTroisiemeNote(), criteria.getTroisiemeNoteMin(), criteria.getTroisiemeNoteMax());
        addPredicateBigDecimal("quatriemeNote", criteria.getQuatriemeNote(), criteria.getQuatriemeNoteMin(), criteria.getQuatriemeNoteMax());
        addPredicateBigDecimal("cinquiemeNote", criteria.getCinquiemeNote(), criteria.getCinquiemeNoteMin(), criteria.getCinquiemeNoteMax());
        addPredicateBigDecimal("sommeDesNotes", criteria.getSommeDesNotes(), criteria.getSommeDesNotesMin(), criteria.getSommeDesNotesMax());
      //   addPredicateInt("annee", criteria.getAnnee(),criteria.getAnneeMin(),criteria.getAnneeMax());
      //  addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employes","id", criteria.getEmployes());
    }

    public NotationSpecification(NotationCriteria criteria) {
        super(criteria);
    }

    public NotationSpecification(NotationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
