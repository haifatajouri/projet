package cat.dao;

import java.awt.print.Pageable;
import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cat.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit,Long> {
	@Query("Select p from Produit p where p.designation like :x")
	public Page<Produit>produitParcMC(@Param("x")String mc,PageRequest pageRequest );
	public List<Produit> findByDesignation(String des );
	public Page<Produit>findByDesignation(String des , Pageable p);
	public List<Produit> findAll();
	
	
	
	

}
