package orm;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
@Entity
@Table(name="film_actor")
public class FilmActor implements Serializable{

		@Id
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="film_id", foreignKey=@ForeignKey(name ="fk_film_actor_film"))
		private Film film;
		
		@Id 
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="actor_id", foreignKey=@ForeignKey(name ="fk_film_actor_actor"))
		private Actor actor;

		public Film getFilm() {
			return film;
		}

		public void setFilm(Film film) {
			this.film = film;
		}

		public Actor getActor() {
			return actor;
		}

		public void setActor(Actor actor) {
			this.actor = actor;
		}
}
