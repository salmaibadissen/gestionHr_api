package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "echelon")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="echelon_seq",sequenceName="echelon_seq",allocationSize=1, initialValue = 1)
public class EchelonHistory extends HistBusinessObject  {


    public EchelonHistory() {
    super();
    }

    public EchelonHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="echelon_seq")
    public Long getId() {
    return id;
    }
}

