package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "promotion")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="promotion_seq",sequenceName="promotion_seq",allocationSize=1, initialValue = 1)
public class PromotionHistory extends HistBusinessObject  {


    public PromotionHistory() {
    super();
    }

    public PromotionHistory(Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="promotion_seq")
    public Long getId() {
    return id;
    }
}

