package com.commerce.backend.model.response.product;

import com.commerce.backend.model.dto.ProductVariantDetailDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductDetailsResponse {
    private String name;

    private String id;
    private String url;
    private String sku;
    @JsonProperty("fullDescription")
    private String longDesc;
    @JsonProperty("shortDescription")
    private String shortDesc;
    private List<String> category;

    @JsonProperty("variation")


    private List<ProductVariantDetailDTO> productVariantDetails;
    private List<String> tag;
    @JsonProperty("new")
    private Boolean newProduct;
    private Integer rating;
    private List<String> image;

    private Float price;
    private Integer saleCount;
    private Integer stock;


}