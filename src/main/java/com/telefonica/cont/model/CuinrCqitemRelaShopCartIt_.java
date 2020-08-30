package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:55.048+0200")
@StaticMetamodel(CuinrCqitemRelaShopCartIt.class)
public class CuinrCqitemRelaShopCartIt_ {
	public static volatile SingularAttribute<CuinrCqitemRelaShopCartIt, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CuinrCqitemRelaShopCartIt, Timestamp> audiTiUpdate;
	public static volatile SingularAttribute<CuinrCqitemRelaShopCartIt, BigDecimal> biitIdCustomerQuoteItem;
	public static volatile SingularAttribute<CuinrCqitemRelaShopCartIt, Long> cqieIdShopCartIt;
	public static volatile SingularAttribute<CuinrCqitemRelaShopCartIt, BigDecimal> userIdCreatorParty;
	public static volatile SingularAttribute<CuinrCqitemRelaShopCartIt, BigDecimal> userIdUpdaterParty;
	public static volatile SingularAttribute<CuinrCqitemRelaShopCartIt, CuinpCustomerQuoteItem> cuinpCustomerQuoteItem;
}
