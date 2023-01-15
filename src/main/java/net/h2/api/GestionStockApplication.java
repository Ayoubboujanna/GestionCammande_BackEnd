package net.h2.api;

import net.h2.api.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.h2.api.dao.ProduitRepository;
import net.h2.api.dao.CategorieRepository;
import net.h2.api.model.Article;
import net.h2.api.model.Categorie;
@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner {
	@Autowired
	private  CategorieRepository rep;
	@Autowired
	private  ProduitRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categorie a=new Categorie("Chaussures");
		Categorie b=new Categorie("Ballons");
		Categorie c=new Categorie("Maillots");
		rep.save(a);
		rep.save(b);
		rep.save(c);
		Produit d=new Produit("Nike Air Force 1",1000.0,1);
		Produit e=new Produit("Adidas Stan Smit",600.0,1);
		Produit f=new Produit("Adidas Superstar",550.0,1);
		Produit g=new Produit("Puma Clyde",650.0,1);
		Produit k=new Produit("Nike Air Jordan one",2200.0,1);
		Produit l=new Produit("Converse All Star",400.0,1);
		Produit h=new Produit("Brazuca",300.0,2);
		Produit t=new Produit("Ulhsport Tenor",310.0,2);
		Produit y=new Produit("Joga Bonito",250.0,2);
		Produit z=new Produit("Adidas UCL",500.0,2);
		Produit q=new Produit("Nike Ordem IV",550.0,2);
		Produit p=new Produit("Maroc ",900.0,3);
		Produit x=new Produit("Real Madrid",1000.0,3);
		Produit r=new Produit("FC Barcelone ",950.0,3);
		Produit m=new Produit("Man Utd",1000.0,3);
		Produit n=new Produit("Olympique de Marseille",700.0,3);
		Produit u=new Produit("Argentine",800.0,3);
		repo.save(d);
		repo.save(e);
		repo.save(f);
		repo.save(g);
		repo.save(h);
		repo.save(k);
		repo.save(z);
		repo.save(y);
		repo.save(m);
		repo.save(n);
		repo.save(r);
		repo.save(x);
		repo.save(u);
		repo.save(t);
		repo.save(p);
		repo.save(q);
		repo.save(l);

	}

}
