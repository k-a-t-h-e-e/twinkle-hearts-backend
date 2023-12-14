package com.commerce.backend.converter.product;

import com.commerce.backend.model.dto.ColorDTO;
import com.commerce.backend.model.dto.ProductVariantDetailDTO;
import com.commerce.backend.model.dto.SizeDTO;
import com.commerce.backend.model.entity.Product;
import com.commerce.backend.model.entity.ProductVariant;
import com.commerce.backend.model.response.product.ProductDetailsResponse;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class ProductDetailsResponseConverter implements Function<Product, ProductDetailsResponse> {
    @Override
    public ProductDetailsResponse apply(Product product) {
        ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse();
        productDetailsResponse.setId(product.getId().toString());
        productDetailsResponse.setName(product.getName());
        productDetailsResponse.setUrl(product.getUrl());
        productDetailsResponse.setLongDesc(product.getLongDesc());
        productDetailsResponse.setShortDesc(product.getLongDesc());

        productDetailsResponse.setSku(product.getSku());
        //productDetailsResponse.setCategory(CategoryDTO.builder().name(product.getProductCategory().getName()).build());
        productDetailsResponse.setCategory(Collections.singletonList(product.getProductCategory().getName()));
        productDetailsResponse.setImage(
                product.getProductVariantList()
                        .stream()
                        .map(ProductVariant::getImage)
                        .collect(Collectors.toList())
        );
        productDetailsResponse.setPrice(product.getProductVariantList()
                .stream()
                .max(Comparator.comparing(ProductVariant::getPrice)).orElse(new ProductVariant()).getPrice()
        );
        productDetailsResponse.setSaleCount(product.getProductVariantList()
                .stream()
                .map(ProductVariant::getSellCount)
                .reduce(0, Integer::sum));

        productDetailsResponse.setStock(product.getProductVariantList()
                .stream()
                .map(ProductVariant::getStock)
                .reduce(0, Integer::sum));


        productDetailsResponse.setRating(product.getRating());
        productDetailsResponse.setNewProduct(product.getNewProduct());
        productDetailsResponse.setTag(product.getTags());
        List<SizeDTO> sizeDTOS = new ArrayList<>();
        sizeDTOS.add(new SizeDTO("x", 1));
        sizeDTOS.add(new SizeDTO("m", 2));
        sizeDTOS.add(new SizeDTO("xl", 3));
        sizeDTOS.add(new SizeDTO("xxl", 4));
        if (!product.getProductVariantList().isEmpty()) {
            productDetailsResponse.setProductVariantDetails(
                    product.getProductVariantList()
                            .stream()
                            .map(productVariant -> ProductVariantDetailDTO
                                    .builder()
                                    .id(productVariant.getId())
                                    .width(productVariant.getWidth())
                                    .height(productVariant.getHeight())
                                    .composition(productVariant.getComposition())
                                    .price(productVariant.getPrice())
                                    .cargoPrice(productVariant.getCargoPrice())
                                    .taxPercent(productVariant.getTaxPercent())
                                    .image(productVariant.getImage())
                                    .thumb(productVariant.getThumb())
                                    .stock(productVariant.getStock())
                                    .live(productVariant.getLive())
                                    .color(productVariant.getColor().getName())
                                    .size(sizeDTOS)
                                    .build()
                            ).collect(Collectors.toList())

            );
        }

        return productDetailsResponse;
    }
}
