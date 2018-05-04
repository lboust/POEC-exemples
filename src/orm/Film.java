package orm;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Film {
	
	//instance fields	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="film_id")
		private Short id;
		
		private String title;
		
		private String description;
		
		@Column(name="release_year")
		private Integer releaseYear;
		
		@Column(name="language_id")
		private Byte languageId;
		
		@Column(name="original_language_id")
		private Byte originalLanguageId;
		
		@Column(name="rental_duration")
		private Byte rentalDuration;
		
		@Column(name="rental_rate")
		private BigDecimal rentalRate;
		 
		private Short length;
		
		@Column(name="replacement_cost")
		private BigDecimal replacementCost;
		
		//@Enumerated(EnumType.STRING)
		private String rating;
		
		@Column(name="special_features")
		private String SpecialFeatures;
		
		@Column(name="last_update")
		private Instant lastUpdate;
		
		@OneToMany(mappedBy = "film")
		private Set<FilmActor> filmActors = new HashSet<>();
		
		/*@ManyToMany
		@JoinTable(
				name="film_actor", joinColumns = @JoinColumn(name="film_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
		private Set<Actor> actors = new HashSet<>();*/
		
		//getters and setters
		public Short getId() {
			return id;
		}

		public void setId(Short id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getReleaseYear() {
			return releaseYear;
		}

		public void setReleaseYear(Integer releaseYear) {
			this.releaseYear = releaseYear;
		}

		public Byte getLanguageId() {
			return languageId;
		}

		public void setLanguageId(Byte languageId) {
			this.languageId = languageId;
		}

		public Byte getOriginalLanguageId() {
			return originalLanguageId;
		}

		public void setOriginalLanguageId(Byte originalLanguageId) {
			this.originalLanguageId = originalLanguageId;
		}

		public Byte getRentalDuration() {
			return rentalDuration;
		}

		public void setRentalDuration(Byte rentalDuration) {
			this.rentalDuration = rentalDuration;
		}

		public BigDecimal getRentalRate() {
			return rentalRate;
		}

		public void setRentalRate(BigDecimal rentalRate) {
			this.rentalRate = rentalRate;
		}

		public Short getLength() {
			return length;
		}

		public void setLength(Short length) {
			this.length = length;
		}

		public BigDecimal getReplacementCost() {
			return replacementCost;
		}

		public void setReplacementCost(BigDecimal replacementCost) {
			this.replacementCost = replacementCost;
		}

		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

		public String getSpecialFeatures() {
			return SpecialFeatures;
		}

		public void setSpecialFeatures(String specialFeatures) {
			SpecialFeatures = specialFeatures;
		}

		public Instant getLastUpdate() {
			return lastUpdate;
		}

		public void setLastUpdate(Instant lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

		public Set<FilmActor> getFilmactors() {
			return filmActors;
		}

		/*public Set<Actor> getActors() {
			return actors;
		}*/
}


	