package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/22/2017
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> categories;

}