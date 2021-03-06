package beans.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nom")
	private String nom;
	@Column(name = "adresse")
	private String adresse;

	public Client() {
		super();
	}

	public Client(String nom, String adresse) {
		super();

		this.nom = nom;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
