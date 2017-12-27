package com.isamm.marketplace.metier;

import java.util.List;

import com.isamm.marketplace.entities.Categorie;
import com.isamm.marketplace.entities.Role;
import com.isamm.marketplace.entities.User;

public interface IAdminCategoriesMetier extends IAdminProduitsMetier {

	public Long ajouterCategorie(Categorie c );
	public void supprimerCategorie(Long idCat);
	public void modifierCategorie(Categorie c);
	
	public void ajouterUser(User u );
	public void attribueRole(User u, Role e);
	
}
