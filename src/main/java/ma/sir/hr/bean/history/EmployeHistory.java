package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "employe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="employe_seq",sequenceName="employe_seq",allocationSize=1, initialValue = 1)
public class EmployeHistory extends HistBusinessObject  {


    public EmployeHistory() {
    super();
    }

    public EmployeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="employe_seq")
    public Long getId() {
    return id;
    }
}

