package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.682+0200")
@StaticMetamodel(CordrCorderLocation.class)
public class CordrCorderLocation_ {
    public static volatile SingularAttribute<CordrCorderLocation, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCorderLocation, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCorderLocation, BigDecimal> coloIdCorderLocation;
    public static volatile SingularAttribute<CordrCorderLocation, Long> placIdGeoSite;
    public static volatile SingularAttribute<CordrCorderLocation, Long> pltyIdPlaceType;
    public static volatile SingularAttribute<CordrCorderLocation, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCorderLocation, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCorderLocation, CordpCustomerOrder> cordpCustomerOrder;
    public static volatile ListAttribute<CordrCorderLocation, CordrCorderItemLocation> cordrCorderItemLocations;
}
