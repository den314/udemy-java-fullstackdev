package devopsbuddy.backend.persistance.repositories;

import devopsbuddy.backend.persistance.domain.backend.Role;
import devopsbuddy.backend.persistance.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author TheDioniz, created on 14.06.2017.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}