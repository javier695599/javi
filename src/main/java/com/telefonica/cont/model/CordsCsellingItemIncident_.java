package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.023+0200")
@StaticMetamodel(CordsCsellingItemIncident.class)
public class CordsCsellingItemIncident_ {
    public static volatile SingularAttribute<CordsCsellingItemIncident, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsellingItemIncident, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsellingItemIncident, BigDecimal> biitIdCustomerSellingItem;
    public static volatile SingularAttribute<CordsCsellingItemIncident, BigDecimal> csiiIdCsellingItemIncident;
    public static volatile SingularAttribute<CordsCsellingItemIncident, Long> csitIdCsellingItemType;
    public static volatile SingularAttribute<CordsCsellingItemIncident, Long> inciIdIncident;
    public static volatile SingularAttribute<CordsCsellingItemIncident, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsellingItemIncident, BigDecimal> userIdUpdaterParty;
}
