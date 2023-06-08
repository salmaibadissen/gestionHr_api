package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Echelle;
import ma.sir.hr.dao.criteria.core.EchelleCriteria;
import ma.sir.hr.dao.criteria.history.EchelleHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;

public interface EchelleAdminService extends  IService<Echelle,EchelleCriteria, EchelleHistoryCriteria>  {


}
