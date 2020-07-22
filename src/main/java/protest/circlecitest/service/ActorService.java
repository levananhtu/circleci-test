package protest.circlecitest.service;

import org.springframework.stereotype.Service;
import protest.circlecitest.entity.Actor;
import protest.circlecitest.repository.ActorRepository;

import java.util.logging.Logger;

@Service
public class ActorService {
    private static final Logger LOGGER = Logger.getLogger(ActorService.class.getName());
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public Actor findActorById(Short id) {
        return actorRepository.findById(id).orElseThrow(NullPointerException::new);
    }
}
