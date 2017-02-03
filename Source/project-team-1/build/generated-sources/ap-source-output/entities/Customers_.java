package entities;

import entities.Comments;
import entities.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-07T00:58:20")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile CollectionAttribute<Customers, Comments> commentsCollection;
    public static volatile SingularAttribute<Customers, String> customerName;
    public static volatile SingularAttribute<Customers, String> username;
    public static volatile SingularAttribute<Customers, String> passwordForget;
    public static volatile SingularAttribute<Customers, Short> status;
    public static volatile SingularAttribute<Customers, String> customerAddress;
    public static volatile SingularAttribute<Customers, String> customerRole;
    public static volatile SingularAttribute<Customers, String> customerPhone;
    public static volatile SingularAttribute<Customers, String> customerEmail;
    public static volatile SingularAttribute<Customers, Integer> customerID;
    public static volatile CollectionAttribute<Customers, Orders> ordersCollection;
    public static volatile SingularAttribute<Customers, String> password;

}