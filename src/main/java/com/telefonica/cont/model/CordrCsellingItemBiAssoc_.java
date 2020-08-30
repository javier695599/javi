package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.698+0200")
@StaticMetamodel(CordrCsellingItemBiAssoc.class)
public class CordrCsellingItemBiAssoc_ {
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, BigDecimal> buinIdBusinessInterac;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, Date> csibDaEndValidity;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, Date> csibDaStartValidity;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, BigDecimal> csibIdCsellingItemBiAssoc;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, CordpCustomerSellingItem> cordpCustomerSellingItem;
    public static volatile SingularAttribute<CordrCsellingItemBiAssoc, CordrCsellingItemBiType> cordrCsellingItemBiType;
}
