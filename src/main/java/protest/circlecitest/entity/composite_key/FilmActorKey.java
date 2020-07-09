package protest.circlecitest.entity.composite_key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FilmActorKey implements Serializable {
    @Column(name = "actor_id", scale = 5, nullable = false)
    private Short actorId;

    @Column(name = "film_id", scale = 5, nullable = false)
    private Short filmId;

    public FilmActorKey() {
    }

    public FilmActorKey(Short actorId, Short filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    public Short getActorId() {
        return actorId;
    }

    public Short getFilmId() {
        return filmId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }
}
