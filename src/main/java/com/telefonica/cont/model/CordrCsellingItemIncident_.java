package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.714+0200")
@StaticMetamodel(CordrCsellingItemIncident.class)
public class CordrCsellingItemIncident_ {
    public static volatile SingularAttribute<CordrCsellingItemIncident, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingItemIncident, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingItemIncident, BigDecimal> csiiIdCsellingItemIncident;
    public static volatile SingularAttribute<CordrCsellingItemIncident, Long> inciIdIncident;
    public static volatile SingularAttribute<CordrCsellingItemIncident, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingItemIncident, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingItemIncident, CordpCustomerSellingItem> cordpCustomerSellingItem;
}
