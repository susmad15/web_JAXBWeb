package data;

import data.Gender;
import data.Representative;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-01T12:13:15")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Gender> gender;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, Long> id;
    public static volatile SingularAttribute<Customer, Representative> representative;

}