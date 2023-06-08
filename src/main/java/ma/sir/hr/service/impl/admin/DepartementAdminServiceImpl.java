package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Departement;
import ma.sir.hr.bean.history.DepartementHistory;
import ma.sir.hr.dao.criteria.core.DepartementCriteria;
import ma.sir.hr.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.hr.dao.facade.core.DepartementDao;
import ma.sir.hr.dao.facade.core.EmployeDao;
import ma.sir.hr.dao.facade.history.DepartementHistoryDao;
import ma.sir.hr.dao.specification.core.DepartementSpecification;
import ma.sir.hr.service.facade.admin.DepartementAdminService;
import ma.sir.hr.ws.converter.DepartementConverter;
import ma.sir.hr.ws.dto.DepartementDto;
import ma.sir.hr.ws.dto.EmployeDto;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.hr.bean.core.Employe;

import ma.sir.hr.service.facade.admin.EmployeAdminService ;

@Service
public class DepartementAdminServiceImpl extends AbstractServiceImpl<Departement,DepartementHistory, DepartementCriteria, DepartementHistoryCriteria, DepartementDao,
DepartementHistoryDao> implements DepartementAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Departement create(Departement t) {
        super.create(t);

        if (t.getEmployes() != null) {
                t.getEmployes().forEach(element-> {
                    element.setDepartement(t);
                    employeService.create(element);
            });
        }
        return t;
    }

   /* public Departement findWithAssociatedLists(Long id){
        Departement result = dao.findById(id).orElse(null);
      if(result!=null && result.getId() != null) {
            result.setPostes(posteService.findByDepartementId(id));
            result.setEmployes(employeService.findByDepartementId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        posteService.deleteByDepartementId(id);
        employeService.deleteByDepartementId(id);
    }


    public void updateWithAssociatedLists(Departement departement){
    if(departement !=null && departement.getId() != null){
            List<List<Poste>> resultPostes= posteService.getToBeSavedAndToBeDeleted(posteService.findByDepartementId(departement.getId()),departement.getPostes());
            posteService.delete(resultPostes.get(1));
            ListUtil.emptyIfNull(resultPostes.get(0)).forEach(e -> e.setDepartement(departement));
            posteService.update(resultPostes.get(0),true);
            List<List<Employe>> resultEmployes= employeService.getToBeSavedAndToBeDeleted(employeService.findByDepartementId(departement.getId()),departement.getEmployes());
            employeService.delete(resultEmployes.get(1));
            ListUtil.emptyIfNull(resultEmployes.get(0)).forEach(e -> e.setDepartement(departement));
            employeService.update(resultEmployes.get(0),true);
    }
    }*/
   public ResponseEntity<DepartementDto> save(DepartementDto dto) throws Exception {
       // Vérifier si l'employé existe déjà dans la base de données
       if (departementDao.findByNom(dto.getNom())!=null ){
           throw new Exception("Departement" + dto.getNom() + " existe déjà");
       }
       else{

          Departement departement = departementConverter.toItem(dto);
           departement = departementDao.save(departement);

           DepartementDto responseDto = departementConverter.toDto(departement);
           return ResponseEntity.ok(responseDto);
       }
   }

    public List<Departement> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }

    public void configure() {
        super.configure(Departement.class,DepartementHistory.class, DepartementHistoryCriteria.class, DepartementSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
   @Autowired
   private DepartementDao departementDao;
   @Autowired
   private DepartementConverter departementConverter;
    public DepartementAdminServiceImpl(DepartementDao dao, DepartementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}