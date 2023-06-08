package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "echelle")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="echelle_seq",sequenceName="echelle_seq",allocationSize=1, initialValue = 1)
public class EchelleHistory extends HistBusinessObject  {


    public EchelleHistory() {
    super();
    }

    public EchelleHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="echelle_seq")
    public Long getId() {
    return id;
    }
}

