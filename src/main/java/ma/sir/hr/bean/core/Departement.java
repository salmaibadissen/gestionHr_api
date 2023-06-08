package ma.sir.hr.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "departement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="departement_seq",sequenceName="departement_seq",allocationSize=1, initialValue = 1)
public class Departement   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String discription;

    private Employe employe ;

    private List<Employe> employes ;

    public Departement(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="departement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getDiscription(){
        return this.discription;
    }
    public void setDiscription(String discription){
        this.discription = discription;
    }

    @OneToMany(mappedBy = "departement")
    public List<Employe> getEmployes(){
        return this.employes;
    }
    public void setEmployes(List<Employe> employes){
        this.employes = employes;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement departement = (Departement) o;
        return id != null && id.equals(departement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

