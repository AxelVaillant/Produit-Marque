package dao;

import model.Produit;

public class metier {
public static void main(String[] args) {
	Produit pro = new Produit(1,"dff","dedf",24.5);
	IProduit dao = new ProduitDAO();
	dao.saveProduct(pro);
	
}
}
