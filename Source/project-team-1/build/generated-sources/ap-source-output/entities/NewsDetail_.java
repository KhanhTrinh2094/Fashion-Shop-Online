package entities;

import entities.NewsCate;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-07T00:58:20")
@StaticMetamodel(NewsDetail.class)
public class NewsDetail_ { 

    public static volatile SingularAttribute<NewsDetail, String> newsImage;
    public static volatile SingularAttribute<NewsDetail, NewsCate> newsCateID;
    public static volatile SingularAttribute<NewsDetail, Integer> newsID;
    public static volatile SingularAttribute<NewsDetail, Short> status;
    public static volatile SingularAttribute<NewsDetail, String> newsDescription;
    public static volatile SingularAttribute<NewsDetail, String> newsContent;
    public static volatile SingularAttribute<NewsDetail, Date> newsDate;
    public static volatile SingularAttribute<NewsDetail, String> newsTitle;

}