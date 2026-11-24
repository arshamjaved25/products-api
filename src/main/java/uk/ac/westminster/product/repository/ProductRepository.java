package uk.ac.westminster.product.repository;

import java.util.Optional;
import java.util.List;
import uk.ac.westminster.products_api.Product;

import javax.swing.text.html.Option;

public interface ProductRepository {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    void delete(Long id);
}
