package entities;

import entities.Customers;
import entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-07T00:58:20")
@StaticMetamodel(Comments.class)
public class Comments_ { 

    public static volatile SingularAttribute<Comments, String> commentDetails;
    public static volatile SingularAttribute<Comments, Short> status;
    public static volatile SingularAttribute<Comments, Integer> commentID;
    public static volatile SingularAttribute<Comments, Customers> customerID;
    public static volatile SingularAttribute<Comments, Products> productID;

}