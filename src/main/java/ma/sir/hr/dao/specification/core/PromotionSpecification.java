package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.PromotionCriteria;
import ma.sir.hr.bean.core.Promotion;

public class PromotionSpecification extends  AbstractSpecification<PromotionCriteria, Promotion>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("grade","id", criteria.getGrade()==null?null:criteria.getGrade().getId());

        addPredicate("dateActivation", criteria.getDateActivation(),criteria.getDateActivationTo(),criteria.getGetDateActivationFrom());
        addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("echelle","id", criteria.getEchelle()==null?null:criteria.getEchelle().getId());
        addPredicateFk("echelle","id", criteria.getEchelles());
        addPredicateFk("echelon","id", criteria.getEchelons()==null?null:criteria.getEchelon().getId());
        addPredicateFk("echelon","id", criteria.getEchelons());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employes","id", criteria.getEmployes());


    }


    public PromotionSpecification(PromotionCriteria criteria) {
        super(criteria);
    }

    public PromotionSpecification(PromotionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
