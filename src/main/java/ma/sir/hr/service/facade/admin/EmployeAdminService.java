package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.dao.criteria.core.EmployeCriteria;
import ma.sir.hr.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.hr.ws.converter.EmployeConverter;
import ma.sir.hr.zynerator.service.IService;

public interface EmployeAdminService extends  IService<Employe,EmployeCriteria, EmployeHistoryCriteria>  {

    List<Employe> findBySexeId(Long id);
    int deleteBySexeId(Long id);
    List<Employe> findByParcoursUniversitaireId(Long id);
    List<Employe> findByLocalId(Long id);

    int deleteByParcoursUniversitaireId( Long id);
    List<Employe> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<Employe> findByPoste(String poste);
    int deleteByPoste(String poste);
    List<Employe> findByNotationId(Long id);
    int deleteByNotationId(Long id);
    List<Employe> findByPromotionId(Long id);
    int deleteByPromotionId(Long id);
    Employe findByMatricule(Integer matricule);


}
