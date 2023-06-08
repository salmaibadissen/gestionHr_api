package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "parcours_universitaire")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="parcours_universitaire_seq",sequenceName="parcours_universitaire_seq",allocationSize=1, initialValue = 1)
public class ParcoursUniversitaireHistory extends HistBusinessObject  {


    public ParcoursUniversitaireHistory() {
    super();
    }

    public ParcoursUniversitaireHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="parcours_universitaire_seq")
    public Long getId() {
    return id;
    }
}

