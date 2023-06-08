package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "grade")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="grade_seq",sequenceName="grade_seq",allocationSize=1, initialValue = 1)
public class GradeHistory extends HistBusinessObject  {


    public GradeHistory() {
    super();
    }

    public GradeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="grade_seq")
    public Long getId() {
    return id;
    }
}

