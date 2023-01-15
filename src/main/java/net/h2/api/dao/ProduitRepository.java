package net.h2.api.dao;

import net.h2.api.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import net.h2.api.model.Article;


public interface ProduitRepository extends JpaRepository<Produit,Integer> {
}