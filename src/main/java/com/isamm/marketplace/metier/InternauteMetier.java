package com.isamm.marketplace.metier;

import java.util.List;

import com.isamm.marketplace.entities.Categorie;
import com.isamm.marketplace.entities.Client;
import com.isamm.marketplace.entities.Commande;
import com.isamm.marketplace.entities.Panier;
import com.isamm.marketplace.entities.Produit;

public interface InternauteMetier {

	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idC);
	public List<Produit> listProduits();
	public List<Produit> listProduitsParMc(String mc);
	public List<Produit> listProduitsSelectionne();
	public List<Produit> listProduitsParCategorie(Long idCat);
	public Produit getProduit(Long idPro);
	public Commande enrigistrerCommande(Panier p , Client c);

}
