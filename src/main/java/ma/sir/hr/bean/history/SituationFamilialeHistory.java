package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "notification")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="notification_seq",sequenceName="notification_seq",allocationSize=1, initialValue = 1)
public class SituationFamilialeHistory extends HistBusinessObject  {


    public SituationFamilialeHistory() {
    super();
    }

    public SituationFamilialeHistory(Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="notification_seq")
    public Long getId() {
    return id;
    }
}

