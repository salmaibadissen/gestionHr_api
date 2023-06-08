package ma.sir.hr.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "SituationFamiliale")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="SituationFamiliale_seq",sequenceName="SituationFamiliale_seq",allocationSize=1, initialValue = 1)
public class SituationFamiliale extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String reference;
   // private LocalDateTime dateNotification ;


    public SituationFamiliale(){
        super();
    }
    public SituationFamiliale(Long id,String reference){
        this.id = id;
        this.reference = reference ;
    }






    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="situationFamiliale_seq")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SituationFamiliale situationFamiliale = (SituationFamiliale) o;
        return id != null && id.equals(situationFamiliale.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

