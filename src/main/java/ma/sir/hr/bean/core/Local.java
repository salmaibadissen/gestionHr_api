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
@Table(name = "local")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="local_seq",sequenceName="local_seq",allocationSize=1, initialValue = 1)
public class Local   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String libelle;
    private String localisation ;



    public Local(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="local_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return id != null && id.equals(local.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

