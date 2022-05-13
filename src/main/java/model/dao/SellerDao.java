package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller id);
	void update(Seller id);
	void delete(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
