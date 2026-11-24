package uk.ac.westminster.product.repository;

import org.springframework.stereotype.Repository;
import uk.ac.westminster.products_api.Product;

import java.util.HashMap;
import java.util.Optional;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private final map<Long, Product> store = new HashMap<>();
    private Long nextId = 1L;

    public InMemoryProductRepository() {
// TODO: create your seed products here and save() each one
    }

    @Override
    public Product save (Product product) {

    }
    @Override
    public Optional<Product> findById(Long id) {

    }
    @Override
    public void delete(Long id) {

    }
}
