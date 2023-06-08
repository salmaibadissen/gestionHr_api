package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "local")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="local_seq",sequenceName="local_seq",allocationSize=1, initialValue = 1)
public class LocalHistory extends HistBusinessObject  {


    public LocalHistory() {
    super();
    }

    public LocalHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="local_seq")
    public Long getId() {
    return id;
    }
}

