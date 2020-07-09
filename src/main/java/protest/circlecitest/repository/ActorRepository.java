package protest.circlecitest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import protest.circlecitest.entity.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Short> {
}
