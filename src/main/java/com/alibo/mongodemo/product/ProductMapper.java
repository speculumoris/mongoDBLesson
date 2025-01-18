package com.alibo.mongodemo.product;

public class ProductMapper {

    public static ProductDto toDto(Product product) {
        if (product == null) {
            return null;
        }

        ProductDto dto = new ProductDto();
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setCategory(product.getCategory());
        dto.setTags(product.getTags());
        return dto;
    }

    public static Product toEntity(ProductDto dto) {
        if (dto == null) {
            return null;
        }

        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setCategory(dto.getCategory());
        product.setTags(dto.getTags());
        return product;
    }



}

