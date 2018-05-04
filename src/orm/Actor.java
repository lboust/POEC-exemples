package orm;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Actor {
	//instance fields	
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column(name="actor_id")
			private Short id;
			
			@Column(name="first_name")
			private String firstName;
			
			@Column(name="last_name")
			private String lastName;
			
			@Column(name="last_update")
			private Instant lastUpdate;
			
			/*@ManyToMany(mappedBy = "actors")
			private Set<Film> films = new HashSet<>();*/
			
			@OneToMany(mappedBy = "actor")
			private Set<FilmActor> filmActors = new HashSet<>();

			//getters and setters
			public Short getId() {
				return id;
			}

			public void setId(Short id) {
				this.id = id;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public Instant getLastUpdate() {
				return lastUpdate;
			}

			public void setLastUpdate(Instant lastUpdate) {
				this.lastUpdate = lastUpdate;
			}

			public Set<FilmActor> getFilmActors() {
				return filmActors;
			}

			/*public Set<Film> getFilms() {
				return films;
			}*/
			
			
}
