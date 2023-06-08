package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Departement;
import ma.sir.hr.dao.criteria.core.DepartementCriteria;
import ma.sir.hr.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;

public interface DepartementAdminService extends  IService<Departement,DepartementCriteria, DepartementHistoryCriteria>  {

    List<Departement> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);



}
