package com.alibo.mongodemo.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String save(ProductDto dto) {
        Product product = ProductMapper.toEntity(dto);
        return productRepository.save(product).getId();
    }

    public Product findById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void delete(String id) {
        productRepository.deleteById(id);
    }
}
