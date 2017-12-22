package guru.springfamework.services;

import guru.springfamework.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/22/2017
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
