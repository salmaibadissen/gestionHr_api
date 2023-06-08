package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.bean.history.EmployeHistory;
import ma.sir.hr.dao.criteria.core.EmployeCriteria;
import ma.sir.hr.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.hr.dao.facade.core.EmployeDao;
import ma.sir.hr.dao.facade.history.EmployeHistoryDao;
import ma.sir.hr.dao.specification.core.EmployeSpecification;
import ma.sir.hr.service.facade.admin.*;
import ma.sir.hr.ws.converter.EmployeConverter;
import ma.sir.hr.ws.dto.EmployeDto;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.DateUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe,EmployeHistory, EmployeCriteria, EmployeHistoryCriteria, EmployeDao,
EmployeHistoryDao> implements EmployeAdminService {


    public Employe findByReferenceEntity(Employe t) {
        return dao.findByUsername(t.getUsername());
    }

    public List<Employe> findBySexeId(Long id) {
        return dao.findBySexeId(id);
    }

    public int deleteBySexeId(Long id) {
        return dao.deleteBySexeId(id);
    }

    public List<Employe> findByParcoursUniversitaireId(Long id) {
        return dao.findByParcoursUniversitaireId(id);
    }

    public List<Employe> findByLocalId(Long id) {
        return dao.findByLocalId(id);
    }


    public int deleteByParcoursUniversitaireId(Long id) {
        return dao.deleteByParcoursUniversitaireId(id);
    }

    public List<Employe> findByDepartementId(Long id) {
        return dao.findByDepartementId(id);
    }

    public int deleteByDepartementId(Long id) {
        return dao.deleteByDepartementId(id);
    }

    @Override
    public List<Employe> findByPoste(String poste) {
        return dao.findByPoste(poste);
    }

    @Override
    public int deleteByPoste(String poste) {
        return dao.deleteByPoste(poste);
    }

    public List<Employe> findByNotationId(Long id) {
        return dao.findByNotationId(id);
    }

    public int deleteByNotationId(Long id) {
        return dao.deleteByNotationId(id);
    }

    public List<Employe> findByPromotionId(Long id) {
        return dao.findByPromotionId(id);
    }

    public int deleteByPromotionId(Long id) {
        return dao.deleteByPromotionId(id);
    }

    @Override
    public Employe findByMatricule(Integer matricule) {
        return employeDao.findByMatricule(matricule);
    }

    public void configure() {
        super.configure(Employe.class, EmployeHistory.class, EmployeHistoryCriteria.class, EmployeSpecification.class);
    }

    public ResponseEntity<EmployeDto> save(EmployeDto dto) throws Exception {

        if (employeDao.findByMatricule(dto.getMatricule()) != null) {
            throw new Exception("L'employé avec la matricule " + dto.getMatricule() + " existe déjà");
        } else if (employeDao.findByUsername(dto.getUsername()) != null) {
            throw new Exception("L'employé avec usernmae " + dto.getUsername() + " existe déjà");

        } else if (employeDao.findByCin(dto.getCin()) != null) {
            throw new Exception("L'employé avec cin " + dto.getCin() + " existe déjà");
        } else {

            Employe employe = employeConverter.toItem(dto);
            employe = employeDao.save(employe);

            EmployeDto responseDto = employeConverter.toDto(employe);
            return ResponseEntity.ok(responseDto);
        }


    }
    public Employe findBySexeLibelle(String  libelle) {
        return dao.findBySexeLibelle(libelle);
    }
   public long countBySexeLibelle(String libelle){
        return  employeDao.countBySexeLibelle(libelle);
   }
    public Map<String, Long> getRepartitionParDepartement() {
        List<Object[]> results = employeDao.countByDepartement();
        Map<String, Long> repartition = new HashMap<>();

        for (Object[] result : results) {
            String departementNom = (String) result[0];
            Long count = (Long) result[1];
            repartition.put(departementNom, count);
        }

        return repartition;
    }

  public long countByDepartementNom(String nom){
        return employeDao.countByDepartementNom(nom);
  }

    public long countFemmes() {
       return  employeDao.countBySexeLibelle("Femme");
    }


   public long countHommes() {
        return employeDao.countBySexeLibelle("Homme") ;
    }

    public boolean existsByUsernameAndPassword(String username, String password) {
        return employeDao.existsByUsernameAndPassword(username, password);
    }







@Autowired
    private DepartementAdminService departementService ;

    @Autowired
    private CongesAdminService congesService ;

    @Autowired
    private NotationAdminService notationService ;
    @Autowired
    private PromotionAdminService promotionAdminService;
    @Autowired
    private EmployeDao employeDao;
    @Autowired
    private EmployeConverter employeConverter;

    public EmployeAdminServiceImpl(EmployeDao dao, EmployeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}