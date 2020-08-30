package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:53.876+0200")
@StaticMetamodel(CordpCustomerOrderItem.class)
public class CordpCustomerOrderItem_ {
	public static volatile SingularAttribute<CordpCustomerOrderItem, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CordpCustomerOrderItem, Timestamp> audiTiUpdate;
	public static volatile SingularAttribute<CordpCustomerOrderItem, BigDecimal> biitIdCustomerOrderItem;
	public static volatile SingularAttribute<CordpCustomerOrderItem, Long> brspIdRestrictionSpec;
	public static volatile SingularAttribute<CordpCustomerOrderItem, BigDecimal> userIdCreatorParty;
	public static volatile SingularAttribute<CordpCustomerOrderItem, BigDecimal> userIdUpdaterParty;
	public static volatile ListAttribute<CordpCustomerOrderItem, CevcrOpelementCuorItem> cevcrOpelementCuorItems;
	public static volatile SingularAttribute<CordpCustomerOrderItem, CordpCustomerOrder> cordpCustomerOrder;
	public static volatile SingularAttribute<CordpCustomerOrderItem, CordpCustomerSellingItem> cordpCustomerSellingItem;
	public static volatile ListAttribute<CordpCustomerOrderItem, CordrCorderItemLocation> cordrCorderItemLocations;
	public static volatile ListAttribute<CordpCustomerOrderItem, CuinrCoitemRelProdPromoted> cuinrCoitemRelProdPromoteds;
}
