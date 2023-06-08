package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Employe;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Employe;
import java.util.List;


@Repository
public interface EmployeDao extends AbstractRepository<Employe,Long>  {
    boolean existsByUsernameAndPassword(String username, String password);

    Employe findByUsername(String username);
    int deleteByUsername(String username);
    Employe findByMatricule(Integer matricule);
    int deleteByMatricule(Integer matricule);
    Employe findByCin(String cin);
    int deleteByCin(String cin);


    List<Employe> findBySexeId(Long id);
    List<Employe> findByLocalId(Long id);
    int deleteBySexeId(Long id);
    List<Employe> findByParcoursUniversitaireId(Long id);
    int deleteByParcoursUniversitaireId(Long id);
    List<Employe> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<Employe> findByPoste(String poste);
    int deleteByPoste(String poste);
    List<Employe> findByNotationId(Long id);
    int deleteByNotationId(Long id);
    List<Employe> findByPromotionId(Long id);
    int deleteByPromotionId(Long id);


    @Query("SELECT NEW Employe(item.id,item.password) FROM Employe item")
    List<Employe> findAllOptimized();

       Employe findBySexeLibelle(String libelle);
       long countBySexeLibelle(String libelle);
       long countByDepartementNom(String nom);
      @Query("SELECT e.departement.nom, COUNT(e) FROM Employe e GROUP BY e.departement")
       List<Object[]> countByDepartement();


    /*@Query(value = "SELECT * FROM products WHERE MATCH(name, short_description, full_description) "
            + "AGAINST (?1)", nativeQuery = true)
    public Page<Product> get_Count_By_Departement(String keyword, Pageable pageable);*/

}
