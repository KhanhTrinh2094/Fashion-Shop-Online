package entities;

import entities.Brands;
import entities.Category;
import entities.Comments;
import entities.OrderDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-07T00:58:20")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile CollectionAttribute<Products, Comments> commentsCollection;
    public static volatile SingularAttribute<Products, Brands> brandID;
    public static volatile SingularAttribute<Products, String> thumbImage;
    public static volatile SingularAttribute<Products, Category> categoryID;
    public static volatile SingularAttribute<Products, Short> status;
    public static volatile SingularAttribute<Products, String> productDetails;
    public static volatile SingularAttribute<Products, Integer> quantity;
    public static volatile SingularAttribute<Products, Long> productPrice;
    public static volatile SingularAttribute<Products, String> productName;
    public static volatile SingularAttribute<Products, Integer> productID;
    public static volatile SingularAttribute<Products, Integer> orderCount;
    public static volatile CollectionAttribute<Products, OrderDetails> orderDetailsCollection;

}