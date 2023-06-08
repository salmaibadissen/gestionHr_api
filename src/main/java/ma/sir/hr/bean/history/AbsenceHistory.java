package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "absence")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="absence_seq",sequenceName="absence_seq",allocationSize=1, initialValue = 1)
public class AbsenceHistory extends HistBusinessObject  {


    public AbsenceHistory() {
    super();
    }

    public AbsenceHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="absence_seq")
    public Long getId() {
    return id;
    }
}

