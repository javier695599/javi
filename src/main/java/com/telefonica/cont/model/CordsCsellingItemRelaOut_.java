package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.039+0200")
@StaticMetamodel(CordsCsellingItemRelaOut.class)
public class CordsCsellingItemRelaOut_ {
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, BigDecimal> biitIdBusiInteracItem;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, Long> biitIdBusiInteracItemType;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, BigDecimal> biitIdCustomerSellingItem;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, Long> cirtIdCsitemRelaType;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, Long> csitIdCsellingItemType;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, Date> csouDaEndValidity;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, Date> csouDaStartValidity;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, BigDecimal> csouIdCsellingItemRelaOut;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsellingItemRelaOut, BigDecimal> userIdUpdaterParty;
}
