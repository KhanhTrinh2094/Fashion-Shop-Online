package entities;

import entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-07T00:58:20")
@StaticMetamodel(Brands.class)
public class Brands_ { 

    public static volatile SingularAttribute<Brands, Integer> brandID;
    public static volatile SingularAttribute<Brands, Short> status;
    public static volatile CollectionAttribute<Brands, Products> productsCollection;
    public static volatile SingularAttribute<Brands, String> brandName;

}