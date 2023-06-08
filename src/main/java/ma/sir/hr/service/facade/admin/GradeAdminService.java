package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Grade;
import ma.sir.hr.dao.criteria.core.GradeCriteria;
import ma.sir.hr.dao.criteria.history.GradeHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;

public interface GradeAdminService extends  IService<Grade,GradeCriteria, GradeHistoryCriteria>  {




}
