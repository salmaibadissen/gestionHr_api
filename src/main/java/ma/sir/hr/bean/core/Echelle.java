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
@Table(name = "echelle")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="echelle_seq",sequenceName="echelle_seq",allocationSize=1, initialValue = 1)
public class Echelle   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String reference;
    


    public Echelle(){
        super();
    }

    public Echelle(Long id,String reference){
        this.id = id;
        this.reference = reference ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="echelle_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    @Transient
    public String getLabel() {
        label = reference;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Echelle echelle = (Echelle) o;
        return id != null && id.equals(echelle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

