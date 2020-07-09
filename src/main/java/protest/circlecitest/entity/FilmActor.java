package protest.circlecitest.entity;


import protest.circlecitest.entity.composite_key.FilmActorKey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "film_actor")
@Entity(name = "FilmActor")
public class FilmActor {
    @EmbeddedId
    private FilmActorKey filmActorKey;

    @Column(name = "last_update")
    private Date lastUpdate;

    public FilmActor() {
    }

    public FilmActor(FilmActorKey filmActorKey, Date lastUpdate) {
        this.filmActorKey = filmActorKey;
        this.lastUpdate = lastUpdate;
    }

    public FilmActorKey getFilmActorKey() {
        return filmActorKey;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setFilmActorKey(FilmActorKey filmActorKey) {
        this.filmActorKey = filmActorKey;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
