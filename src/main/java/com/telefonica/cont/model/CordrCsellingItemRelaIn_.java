package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.714+0200")
@StaticMetamodel(CordrCsellingItemRelaIn.class)
public class CordrCsellingItemRelaIn_ {
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, Date> csirDaEndValidity;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, Date> csirDaStartValidity;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, BigDecimal> csirIdCsellingItemRelaIn;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, CordpCustomerSellingItem> cordpCustomerSellingItem1;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, CordpCustomerSellingItem> cordpCustomerSellingItem2;
    public static volatile SingularAttribute<CordrCsellingItemRelaIn, CordrCsitemRelaType> cordrCsitemRelaType;
}
