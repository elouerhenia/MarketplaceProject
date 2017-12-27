package com.isamm.marketplace.metier;

import java.util.List;

import com.isamm.marketplace.entities.Produit;

public interface IAdminProduitsMetier extends InternauteMetier {

	public Long ajouterProduit(Produit p, Long  IdCat);
	public void supprimerProduit(Long idPro);
	public void modifierProduit(Produit p);
	
}
