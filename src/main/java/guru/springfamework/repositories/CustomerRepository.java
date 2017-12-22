package guru.springfamework.repositories;

import guru.springfamework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/22/2017
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
