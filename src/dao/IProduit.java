package dao;

import java.util.List;

import model.Marque;
import model.Produit;

public interface IProduit {
public int saveProduct(Produit p);
public List<Produit> getProducts();
public List<Produit> getProducts(Marque marque);
}
