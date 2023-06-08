package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "conges")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="conges_seq",sequenceName="conges_seq",allocationSize=1, initialValue = 1)
public class CongesHistory extends HistBusinessObject  {


    public CongesHistory() {
    super();
    }

    public CongesHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="conges_seq")
    public Long getId() {
    return id;
    }
}

