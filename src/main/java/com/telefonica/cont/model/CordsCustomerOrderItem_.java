package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.101+0200")
@StaticMetamodel(CordsCustomerOrderItem.class)
public class CordsCustomerOrderItem_ {
    public static volatile SingularAttribute<CordsCustomerOrderItem, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCustomerOrderItem, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCustomerOrderItem, BigDecimal> biitIdCustomerOrderItem;
    public static volatile SingularAttribute<CordsCustomerOrderItem, Long> brspIdRestrictionSpec;
    public static volatile SingularAttribute<CordsCustomerOrderItem, BigDecimal> buinIdCustomerOrder;
    public static volatile SingularAttribute<CordsCustomerOrderItem, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCustomerOrderItem, BigDecimal> userIdUpdaterParty;
}
