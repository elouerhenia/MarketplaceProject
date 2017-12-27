package com.isamm.marketplace.dao;

import java.util.List;

import com.isamm.marketplace.entities.Categorie;
import com.isamm.marketplace.entities.Client;
import com.isamm.marketplace.entities.Commande;
import com.isamm.marketplace.entities.Panier;
import com.isamm.marketplace.entities.Produit;
import com.isamm.marketplace.entities.Role;
import com.isamm.marketplace.entities.User;

public interface IBoutiqueDao {

	/* CATEGORIE */
	public Long ajouterCategorie(Categorie c);

	public List<Categorie> listCategories();

	public Categorie getCategorie(Long idC);

	public void supprimerCategorie(Long idCat);

	public void modifierCategorie(Categorie c);

	/* PRODUIT */
	public Long ajouterProduit(Produit p, Long IdCat);

	public List<Produit> listProduits();

	public List<Produit> listProduitsParMc(String mc);

	public List<Produit> listProduitsSelectionne();

	public List<Produit> listProduitsParCategorie(Long idCat);

	public Produit getProduit(Long idPro);

	public void supprimerProduit(Long idPro);

	public void modifierProduit(Produit p);

	/* USER */
	public void ajouterUser(User u);

	public void attribueRole(User u, Role e);

	public Commande enrigistrerCommande(Panier p, Client c);

}
