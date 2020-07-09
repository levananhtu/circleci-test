package protest.circlecitest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import protest.circlecitest.entity.Actor;
import protest.circlecitest.service.ActorService;

@RestController
@RequestMapping(path = "/test/actor")
public class ActorController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ActorController.class);
    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @RequestMapping(path = "find-actor-by-id", method = RequestMethod.GET)
    public Actor findActorById(@RequestParam(name = "actor-id", defaultValue = "1") Short actorId) {
        return actorService.findActorById(actorId);
    }
}
