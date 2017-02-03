package entities;

import entities.NewsDetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-07T00:58:20")
@StaticMetamodel(NewsCate.class)
public class NewsCate_ { 

    public static volatile SingularAttribute<NewsCate, Integer> newsCateID;
    public static volatile SingularAttribute<NewsCate, Short> status;
    public static volatile CollectionAttribute<NewsCate, NewsDetail> newsDetailCollection;
    public static volatile SingularAttribute<NewsCate, String> newsCateName;

}