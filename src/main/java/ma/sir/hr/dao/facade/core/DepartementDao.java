package ma.sir.hr.dao.facade.core;

import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Departement;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DepartementDao extends AbstractRepository<Departement,Long>  {

    List<Departement> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    Departement findByNom(String nom);
    int deleteByNom(String nom);

}
