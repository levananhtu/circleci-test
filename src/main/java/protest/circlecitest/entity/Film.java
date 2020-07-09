package protest.circlecitest.entity;

import protest.circlecitest.entity.enum_type.Rating;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "Film")
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", scale = 5)
    private Short filmId;

    @Column(name = "title", length = 128, nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "release_year", scale = 4)
    private Short releaseYear;

    @Column(name = "language_id", scale = 3, nullable = false)
    private Byte languageId;

    @Column(name = "original_language_id", scale = 3)
    private Byte originalLanguageId;

    @Column(name = "rental_duration", scale = 3, nullable = false)
    private Byte rentalDuration;

    @Column(name = "rental_rate", precision = 2, scale = 4, nullable = false)
    private BigDecimal rentalRate;

    @Column(name = "length", scale = 5)
    private Short length;

    @Column(name = "replacement_cost", scale = 5, precision = 2, nullable = false)
    private BigDecimal replacementCost;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "rating", length = 7)
    private Rating rating;

    @Column(name = "special_features", length = 128)
    private String specialFeatures;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public Film() {
    }

    public Short getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Short getReleaseYear() {
        return releaseYear;
    }

    public Byte getLanguageId() {
        return languageId;
    }

    public Byte getOriginalLanguageId() {
        return originalLanguageId;
    }

    public Byte getRentalDuration() {
        return rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public Short getLength() {
        return length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public Rating getRating() {
        return rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseYear(Short releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    public void setOriginalLanguageId(Byte originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public void setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
