package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "notation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="notation_seq",sequenceName="notation_seq",allocationSize=1, initialValue = 1)
public class NotationHistory extends HistBusinessObject  {


    public NotationHistory() {
    super();
    }

    public NotationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="notation_seq")
    public Long getId() {
    return id;
    }
}

