package ma.sir.hr.bean.core;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "promotion")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="promotion_seq",sequenceName="promotion_seq",allocationSize=1, initialValue = 1)
public class Promotion extends AuditBusinessObject     {

    private Long id;

    private Grade grade;

    private Echelon echelon;
    private Echelle echelle;
    private int indice;
    private LocalDateTime dateActivation;

    private Employe employe ;





    public Promotion(){
        super();
    }

    public Promotion(Long id){
        this.id = id;
     //  this.grade = grade ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="promotion_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Echelon getEchelon() {
        return echelon;
    }

    public void setEchelon(Echelon echelon) {
        this.echelon = echelon;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Echelle getEchelle() {
        return echelle;
    }

    public void setEchelle(Echelle echelle) {
        this.echelle = echelle;
    }

    public LocalDateTime getDateActivation() {
        return dateActivation;
    }

    public void setDateActivation(LocalDateTime dateActivation) {
        this.dateActivation = dateActivation;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employe_id")
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

 /*  @Transient
    public String getLabel() {
        label = grade;
        return label;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Promotion grade = (Promotion) o;
        return id != null && id.equals(grade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}

