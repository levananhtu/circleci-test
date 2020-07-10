package protest.circlecitest.service;

import org.springframework.stereotype.Service;
import protest.circlecitest.entity.Actor;
import protest.circlecitest.repository.ActorRepository;

@Service
public class ActorService {
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public Actor findActorById(Short id) {
        return actorRepository.findById(id).orElseThrow(NullPointerException::new);
    }
}
