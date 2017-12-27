package com.isamm.marketplace;

import static org.junit.Assert.*;

import java.util.List;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.isamm.marketplace.entities.Categorie;
import com.isamm.marketplace.entities.Produit;
import com.isamm.marketplace.metier.IAdminCategoriesMetier;

public class TestJPA {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext.xml" });
			IAdminCategoriesMetier metier = (IAdminCategoriesMetier) context.getBean("metier");
			List<Categorie> cats1 = metier.listCategories();
			metier.ajouterCategorie(new Categorie("Ordinateur", "Ordinateurs", null, ""));
			metier.ajouterCategorie(new Categorie("Imprimantes", "Imprimantes", null, ""));
			List<Categorie> cats2 = metier.listCategories();
			assertTrue(cats2.size() == cats1.size() + 2);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
	}

}
