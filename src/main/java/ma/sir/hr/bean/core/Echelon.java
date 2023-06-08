package ma.sir.hr.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "echelon")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="echelon_seq",sequenceName="echelon_seq",allocationSize=1, initialValue = 1)
public class Echelon   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String reference;

    public Echelon(){
        super();
    }

    public Echelon(Long id,String reference){
        this.id = id;
        this.reference = reference ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="echelon_seq")
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
        Echelon echelon = (Echelon) o;
        return id != null && id.equals(echelon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

