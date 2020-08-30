package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.023+0200")
@StaticMetamodel(CordsCsellingItemBiAssoc.class)
public class CordsCsellingItemBiAssoc_ {
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, BigDecimal> biitIdCustomerSellingItem;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, Long> bintIdBusinessInteracType;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, BigDecimal> buinIdBusinessInterac;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, Date> csibDaEndValidity;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, Date> csibDaStartValidity;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, BigDecimal> csibIdCsellingItemBiAssoc;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, Long> csitIdCsellingItemType;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsellingItemBiAssoc, BigDecimal> userIdUpdaterParty;
}
