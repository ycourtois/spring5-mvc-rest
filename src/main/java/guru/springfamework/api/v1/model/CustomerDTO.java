package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/22/2017
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String firstname;
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}
