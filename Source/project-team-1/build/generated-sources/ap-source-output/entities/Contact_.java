package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-07T00:58:20")
@StaticMetamodel(Contact.class)
public class Contact_ { 

    public static volatile SingularAttribute<Contact, Short> status;
    public static volatile SingularAttribute<Contact, Integer> contactID;
    public static volatile SingularAttribute<Contact, String> contactName;
    public static volatile SingularAttribute<Contact, String> contactDetails;
    public static volatile SingularAttribute<Contact, String> contactMail;

}