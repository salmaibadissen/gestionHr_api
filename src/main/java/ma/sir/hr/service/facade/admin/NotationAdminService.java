package ma.sir.hr.service.facade.admin;

import java.util.List;

import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.bean.core.Notation;
import ma.sir.hr.dao.criteria.core.NotationCriteria;
import ma.sir.hr.dao.criteria.history.NotationHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;

public interface NotationAdminService extends  IService<Notation,NotationCriteria, NotationHistoryCriteria>  {


    int deleteByEmployeId(Long id);

    Notation findByEmployeId(Long id);
}
