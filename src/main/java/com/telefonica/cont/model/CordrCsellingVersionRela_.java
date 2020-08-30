package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.898+0200")
@StaticMetamodel(CordrCsellingVersionRela.class)
public class CordrCsellingVersionRela_ {
    public static volatile SingularAttribute<CordrCsellingVersionRela, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingVersionRela, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingVersionRela, BigDecimal> csveIdCsellingVersionRela;
    public static volatile SingularAttribute<CordrCsellingVersionRela, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingVersionRela, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingVersionRela, CordpCustomerSelling> cordpCustomerSelling1;
    public static volatile SingularAttribute<CordrCsellingVersionRela, CordpCustomerSelling> cordpCustomerSelling2;
    public static volatile SingularAttribute<CordrCsellingVersionRela, CordrCsellingVersionType> cordrCsellingVersionType;
}
