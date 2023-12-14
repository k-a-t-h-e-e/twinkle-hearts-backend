package com.commerce.backend.model.entity;

import com.commerce.backend.converter.model.StringListConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"productCategory", "productVariantList"})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductVariant> productVariantList;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "long_desc")
    @Type(type = "text")
    private String longDesc;

    @Column(name = "date_created", insertable = false)
    private Date dateCreated;

    @Column(name = "last_updated", insertable = false)
    @Type(type = "timestamp")
    private Date lastUpdated;

    @Column(name = "unlimited")
    private Integer unlimited;

    @Column(name = "rating")
    private Integer rating;

    @Convert(converter = StringListConverter.class)
    @Column(name = "tags", nullable = false)
    private List<String> tags = new ArrayList<>();

    @Column(name = "new")
    private Boolean newProduct;




}

