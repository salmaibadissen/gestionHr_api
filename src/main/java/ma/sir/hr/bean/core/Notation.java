package ma.sir.hr.bean.core;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;
import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "notation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="notation_seq",sequenceName="notation_seq",allocationSize=1, initialValue = 1)
public class Notation   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal premierNote = BigDecimal.ZERO;
    private BigDecimal deusiemeNote = BigDecimal.ZERO;
    private BigDecimal troisiemeNote = BigDecimal.ZERO;
    private BigDecimal quatriemeNote = BigDecimal.ZERO;
    private BigDecimal cinquiemeNote = BigDecimal.ZERO;
    private BigDecimal sommeDesNotes = BigDecimal.ZERO;
   private Year annee;
    private Employe employe;



    public Notation(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="notation_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public BigDecimal getPremierNote(){
        return this.premierNote;
    }
    public void setPremierNote(BigDecimal premierNote){
        this.premierNote = premierNote;
    }
    public BigDecimal getDeusiemeNote(){
        return this.deusiemeNote;
    }
    public void setDeusiemeNote(BigDecimal deusiemeNote){
        this.deusiemeNote = deusiemeNote;
    }
    public BigDecimal getTroisiemeNote(){
        return this.troisiemeNote;
    }
    public void setTroisiemeNote(BigDecimal troisiemeNote){
        this.troisiemeNote = troisiemeNote;
    }
    public BigDecimal getQuatriemeNote(){
        return this.quatriemeNote;
    }
    public void setQuatriemeNote(BigDecimal quatriemeNote){
        this.quatriemeNote = quatriemeNote;
    }
    public BigDecimal getCinquiemeNote(){
        return this.cinquiemeNote;
    }
    public void setCinquiemeNote(BigDecimal cinquiemeNote){
        this.cinquiemeNote = cinquiemeNote;
    }
    public BigDecimal getSommeDesNotes(){
        return this.sommeDesNotes;
    }
    public void setSommeDesNotes(BigDecimal sommeDesNotes){
        this.sommeDesNotes = sommeDesNotes;
    }

    public Year getAnnee() {
        return annee;
    }

    public void setAnnee(Year annee) {
        this.annee = annee;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employe_id")
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notation notation = (Notation) o;
        return id != null && id.equals(notation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

