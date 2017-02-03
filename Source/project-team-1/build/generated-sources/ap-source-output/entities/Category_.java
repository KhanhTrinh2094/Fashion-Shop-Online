package entities;

import entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-07T00:58:20")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> categoryName;
    public static volatile SingularAttribute<Category, Short> status;
    public static volatile SingularAttribute<Category, Integer> categoryID;
    public static volatile CollectionAttribute<Category, Products> productsCollection;
    public static volatile SingularAttribute<Category, Short> categorySub;

}