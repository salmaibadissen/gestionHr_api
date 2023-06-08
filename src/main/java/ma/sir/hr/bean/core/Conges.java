package ma.sir.hr.bean.core;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "conges")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="conges_seq",sequenceName="conges_seq",allocationSize=1, initialValue = 1)
public class Conges   extends AuditBusinessObject     {

    private Long id;

    private LocalDate dateDebut ;
    private long duree ;
    private long jourRestantParAnnee = 0;
    private Year annee;
    private long numeroAutorisation = 0;
    private LocalDate dateAutorisation;
    private String Status;

    private Employe employe;




    public Conges(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="conges_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public long getDuree() {
        return duree;
    }

    public void setDuree(long duree) {
        this.duree = duree;
    }

    public Year getAnnee() {
        return annee;
    }

    public void setAnnee(Year annee) {
        this.annee = annee;
    }

    public long getNumeroAutorisation() {
        return numeroAutorisation;
    }

    public void setNumeroAutorisation(long numeroAutorisation) {
        this.numeroAutorisation = numeroAutorisation;
    }

    public LocalDate getDateAutorisation() {
        return dateAutorisation;
    }

    public void setDateAutorisation(LocalDate dateAutorisation) {
        this.dateAutorisation = dateAutorisation;
    }

    public long getJourRestantParAnnee(){
        return this.jourRestantParAnnee;
    }
    public void setJourRestantParAnnee(long jourRestantParAnnee){
        this.jourRestantParAnnee = jourRestantParAnnee;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employe_id")
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }



    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conges conges = (Conges) o;
        return id != null && id.equals(conges.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

