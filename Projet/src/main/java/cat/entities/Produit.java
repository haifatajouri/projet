package cat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Long reference ;
	private String designation ;
	private double prix ;
	/**
	 * @return the reference
	 */
	public Long getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(Long reference) {
		this.reference = reference;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit(Long reference, String designation, double prix) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
	}
	
	

}
