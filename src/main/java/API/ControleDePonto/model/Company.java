package API.ControleDePonto.model;

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
public class Company {

    private Long id;
    private String description;
    private String cnpj;
    private String address;
    private String district;
    private String city;
    private String state;
    private String telephone;
}
