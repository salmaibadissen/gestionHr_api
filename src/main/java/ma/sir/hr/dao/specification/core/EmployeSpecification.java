package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.EmployeCriteria;
import ma.sir.hr.bean.core.Employe;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EmployeSpecification extends  AbstractSpecification<EmployeCriteria, Employe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("login", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("dateDeNaissance", criteria.getDateDeNaissance(), criteria.getDateDeNaissanceFrom(), criteria.getDateDeNaissanceTo());
        addPredicate("lieuDeNaissance", criteria.getLieuDeNaissance(),criteria.getLieuDeNaissanceLike());
        addPredicate("adresse", criteria.getAdresse(),criteria.getAdresseLike());
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicate("tel", criteria.getTel(),criteria.getTelLike());
        addPredicateFk("SituationFamiliale","id", criteria.getSituationFamiliale()==null?null:criteria.getSituationFamiliale().getId());
        addPredicateFk("SituationFamiliale","id", criteria.getSituationFamiliales());
        addPredicate("dateEmbauche", criteria.getDateEmbauche(), criteria.getDateEmbaucheFrom(), criteria.getDateEmbaucheTo());
        addPredicateInt("matricule", criteria.getMatricule(), criteria.getMatriculeMin(), criteria.getMatriculeMax());
        addPredicate("adressEmail", criteria.getAdressEmail(),criteria.getAdressEmailLike());
        addPredicate("compteBancaire", criteria.getCompteBancaire(),criteria.getCompteBancaireLike());
        addPredicateFk("local","id", criteria.getLocal()==null?null:criteria.getLocal().getId());
        addPredicateFk("local","id", criteria.getLocals());
        addPredicateFk("parcoursUniversitaire","id", criteria.getParcoursUniversitaire()==null?null:criteria.getParcoursUniversitaire().getId());

        addPredicateFk("sexe","id", criteria.getSexe()==null?null:criteria.getSexe().getId());
        addPredicateFk("sexe","id", criteria.getSexes());
        addPredicateFk("sexe","reference", criteria.getSexe()==null?null:criteria.getSexe().getReference());
       // addPredicate("parcoursUniversitaire", criteria.getParcoursUniversitaire(),criteria.getParcoursUniversitaireLike());
        addPredicateFk("departement","id", criteria.getDepartement()==null?null:criteria.getDepartement().getId());
        addPredicateFk("departement","id", criteria.getDepartements());
        addPredicateFk("poste", criteria.getPoste(),criteria.getPosteLike());
        addPredicateFk("notation","id", criteria.getNotation()==null?null:criteria.getNotation().getId());
        addPredicateFk("notation","id", criteria.getNotations());
        addPredicateFk("promotion","id", criteria.getPromotion()==null?null:criteria.getPromotion().getId());
        addPredicateFk("promotion","id", criteria.getPromotions());
    }

    public EmployeSpecification(EmployeCriteria criteria) {
        super(criteria);
    }

    public EmployeSpecification(EmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
