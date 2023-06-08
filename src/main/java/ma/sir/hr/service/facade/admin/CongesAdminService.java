package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Conges;
import ma.sir.hr.dao.criteria.core.CongesCriteria;
import ma.sir.hr.dao.criteria.history.CongesHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;

public interface CongesAdminService extends  IService<Conges,CongesCriteria, CongesHistoryCriteria>  {

    Conges findByEmployeCin(String cin);


}
