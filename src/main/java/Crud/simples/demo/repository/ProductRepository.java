package Crud.simples.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Crud.simples.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {    
}
