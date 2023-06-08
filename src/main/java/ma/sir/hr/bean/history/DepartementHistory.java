package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "departement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="departement_seq",sequenceName="departement_seq",allocationSize=1, initialValue = 1)
public class DepartementHistory extends HistBusinessObject  {


    public DepartementHistory() {
    super();
    }

    public DepartementHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="departement_seq")
    public Long getId() {
    return id;
    }
}

