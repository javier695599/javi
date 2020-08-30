package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.300+0200")
@StaticMetamodel(CevcrOpelementCuorItem.class)
public class CevcrOpelementCuorItem_ {
    public static volatile SingularAttribute<CevcrOpelementCuorItem, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOpelementCuorItem, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOpelementCuorItem, BigDecimal> ocoiIdOpelementCuorItem;
    public static volatile SingularAttribute<CevcrOpelementCuorItem, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOpelementCuorItem, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOpelementCuorItem, CevcpOplanElement> cevcpOplanElement;
    public static volatile SingularAttribute<CevcrOpelementCuorItem, CordpCustomerOrderItem> cordpCustomerOrderItem;
}
