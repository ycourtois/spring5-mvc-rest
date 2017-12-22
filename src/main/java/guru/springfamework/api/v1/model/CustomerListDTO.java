package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/22/2017
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerListDTO {
    List<CustomerDTO> customers;
}
