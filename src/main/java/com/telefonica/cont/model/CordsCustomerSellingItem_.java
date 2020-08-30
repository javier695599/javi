package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.414+0200")
@StaticMetamodel(CordsCustomerSellingItem.class)
public class CordsCustomerSellingItem_ {
    public static volatile SingularAttribute<CordsCustomerSellingItem, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCustomerSellingItem, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCustomerSellingItem, BigDecimal> biitIdCustomerSellingItem;
    public static volatile SingularAttribute<CordsCustomerSellingItem, Long> biitQuCustSellItem;
    public static volatile SingularAttribute<CordsCustomerSellingItem, Long> bisiIdBiSpecItem;
    public static volatile SingularAttribute<CordsCustomerSellingItem, Date> csimDaEndCsitem;
    public static volatile SingularAttribute<CordsCustomerSellingItem, Date> csimDaStartCsitem;
    public static volatile SingularAttribute<CordsCustomerSellingItem, Long> csitIdCsellingItemType;
    public static volatile SingularAttribute<CordsCustomerSellingItem, Long> exmoIdExecutionMode;
    public static volatile SingularAttribute<CordsCustomerSellingItem, BigDecimal> prodIdProduct;
    public static volatile SingularAttribute<CordsCustomerSellingItem, Long> unmeIdUnitMeasure;
    public static volatile SingularAttribute<CordsCustomerSellingItem, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCustomerSellingItem, BigDecimal> userIdUpdaterParty;
}
