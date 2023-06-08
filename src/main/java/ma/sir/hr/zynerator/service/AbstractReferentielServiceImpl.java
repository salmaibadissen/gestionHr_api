package ma.sir.hr.zynerator.service;

import ma.sir.hr.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.hr.zynerator.criteria.BaseCriteria;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import ma.sir.hr.zynerator.history.HistCriteria;
import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}