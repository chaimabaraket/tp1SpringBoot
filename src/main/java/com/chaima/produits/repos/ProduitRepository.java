package com.chaima.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaima.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
