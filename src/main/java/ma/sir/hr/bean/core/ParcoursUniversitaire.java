package ma.sir.hr.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "parcours_universitaire")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="parcours_universitaire_seq",sequenceName="parcours_universitaire_seq",allocationSize=1, initialValue = 1)
public class ParcoursUniversitaire   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String deplome;



    public ParcoursUniversitaire(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="parcours_universitaire_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getDeplome(){
        return this.deplome;
    }
    public void setDeplome(String deplome){
        this.deplome = deplome;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcoursUniversitaire parcoursUniversitaire = (ParcoursUniversitaire) o;
        return id != null && id.equals(parcoursUniversitaire.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

