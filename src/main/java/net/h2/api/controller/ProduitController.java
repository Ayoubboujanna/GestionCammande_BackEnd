package net.h2.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import net.h2.api.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.h2.api.dao.ProduitRepository;
import net.h2.api.model.Article;
import net.h2.api.model.Categorie;
@CrossOrigin
@RestController
public class ProduitController {
    @Autowired
    private  ProduitRepository rep;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/saveProduit")
    public Produit saveArticle(@RequestBody Produit ar) {
        return rep.save(ar);
    }
    @GetMapping("/getAllProduit")
    public  List<Produit> getAll(){
        return rep.findAll();
    }
    @GetMapping("/getAllByCat1/{id}")
    public List<Produit> getAllByCat1(@PathVariable int id){
        List<Produit> AllByCat=new ArrayList<Produit>();
        for(Produit cat :rep.findAll()) {
            if(cat.getId_ctg()==id) {
                AllByCat.add(cat);
            }
        }
        return AllByCat;
    }
}
