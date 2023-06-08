package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Local;
import ma.sir.hr.dao.criteria.core.LocalCriteria;
import ma.sir.hr.dao.criteria.history.LocalHistoryCriteria;
import ma.sir.hr.ws.dto.LocalDto;
import ma.sir.hr.zynerator.service.IService;

public interface LocalAdminService extends  IService<Local,LocalCriteria, LocalHistoryCriteria>  {

    Local findByLibelle(String libelle);


}
