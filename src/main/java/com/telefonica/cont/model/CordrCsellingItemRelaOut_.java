package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.729+0200")
@StaticMetamodel(CordrCsellingItemRelaOut.class)
public class CordrCsellingItemRelaOut_ {
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, BigDecimal> biitIdBusiInteracItem;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, Date> csouDaEndValidity;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, Date> csouDaStartValidity;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, BigDecimal> csouIdCsellingItemRelaOut;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, CordpCustomerSellingItem> cordpCustomerSellingItem;
    public static volatile SingularAttribute<CordrCsellingItemRelaOut, CordrCsitemRelaType> cordrCsitemRelaType;
}
