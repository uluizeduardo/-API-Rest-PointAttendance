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
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable {

        private Long idMovement;
        private Long idUser;
    }

    @EmbeddedId
    private MovementId id;
    private LocalDateTime dateEntry;
    private LocalDateTime exitDate;
    private BigDecimal period;
    private Occurrence idOccurrence;
    private LocalDateTime specialDate;

}
