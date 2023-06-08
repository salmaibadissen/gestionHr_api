package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "poste")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="poste_seq",sequenceName="poste_seq",allocationSize=1, initialValue = 1)
public class PosteHistory extends HistBusinessObject  {


    public PosteHistory() {
    super();
    }

    public PosteHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="poste_seq")
    public Long getId() {
    return id;
    }
}

