package API.ControleDePonto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class HourBank {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class AnnualLeaveId implements Serializable {

        private long idHourBank;
        private long idMovement;
        private long idUser;
    }

    @EmbeddedId
    private UserCategory userCategory;
    private LocalDateTime dateWorked;
    private BigDecimal amountOfHours;
    private BigDecimal balanceHours;

}
