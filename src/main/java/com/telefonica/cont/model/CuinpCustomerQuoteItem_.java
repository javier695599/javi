package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:54.767+0200")
@StaticMetamodel(CuinpCustomerQuoteItem.class)
public class CuinpCustomerQuoteItem_ {
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, Timestamp> audiTiUpdate;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, BigDecimal> biitIdCustomerQuoteItem;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, Long> chatIdChannelType;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, Long> genaIdApplication;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, Long> prcaIdProductCatalog;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, BigDecimal> userIdCreatorParty;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, BigDecimal> userIdUpdaterParty;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, CorddPortabilProcessType> corddPortabilProcessType;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, CordpCustomerSellingItem> cordpCustomerSellingItem;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, CuindCqitemSourceType> cuindCqitemSourceType;
	public static volatile ListAttribute<CuinpCustomerQuoteItem, CuinpCqitemPrice> cuinpCqitemPrices;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, CuinpCustomerQuote> cuinpCustomerQuote;
	public static volatile ListAttribute<CuinpCustomerQuoteItem, CuinrCqitemCustomerBill> cuinrCqitemCustomerBills;
	public static volatile SingularAttribute<CuinpCustomerQuoteItem, CuinrCqitemRelaShopCartIt> cuinrCqitemRelaShopCartIt;
	public static volatile ListAttribute<CuinpCustomerQuoteItem, CuinrCqitemRelatedWork> cuinrCqitemRelatedWorks;
	public static volatile ListAttribute<CuinpCustomerQuoteItem, CuinrCqitemRelProdPromoted> cuinrCqitemRelProdPromoteds;
	public static volatile ListAttribute<CuinpCustomerQuoteItem, CuinrCquoteInvolvesPoterm> cuinrCquoteInvolvesPoterms;
}
