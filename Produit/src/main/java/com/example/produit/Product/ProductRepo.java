package com.example.produit.Product;

import com.example.produit.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepo extends JpaRepository <Produit , Long> {
}
