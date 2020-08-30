package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.523+0200")
@StaticMetamodel(CuinrCqitemCustomerBill.class)
public class CuinrCqitemCustomerBill_ {
    public static volatile SingularAttribute<CuinrCqitemCustomerBill, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuinrCqitemCustomerBill, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuinrCqitemCustomerBill, BigDecimal> cqcbIdCqitemCustomerBill;
    public static volatile SingularAttribute<CuinrCqitemCustomerBill, BigDecimal> cullIdCustomerBill;
    public static volatile SingularAttribute<CuinrCqitemCustomerBill, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuinrCqitemCustomerBill, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CuinrCqitemCustomerBill, CuinpCustomerQuoteItem> cuinpCustomerQuoteItem;
}
