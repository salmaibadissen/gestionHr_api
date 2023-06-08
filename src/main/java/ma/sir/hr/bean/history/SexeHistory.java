package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "sexe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="sexe_seq",sequenceName="sexe_seq",allocationSize=1, initialValue = 1)
public class SexeHistory extends HistBusinessObject  {


    public SexeHistory() {
    super();
    }

    public SexeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sexe_seq")
    public Long getId() {
    return id;
    }
}

