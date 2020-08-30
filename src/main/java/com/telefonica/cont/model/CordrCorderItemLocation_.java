package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.667+0200")
@StaticMetamodel(CordrCorderItemLocation.class)
public class CordrCorderItemLocation_ {
    public static volatile SingularAttribute<CordrCorderItemLocation, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCorderItemLocation, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCorderItemLocation, BigDecimal> coilIdCorderItemLocation;
    public static volatile SingularAttribute<CordrCorderItemLocation, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCorderItemLocation, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCorderItemLocation, CordpCustomerOrderItem> cordpCustomerOrderItem;
    public static volatile SingularAttribute<CordrCorderItemLocation, CordrCorderLocation> cordrCorderLocation;
}
