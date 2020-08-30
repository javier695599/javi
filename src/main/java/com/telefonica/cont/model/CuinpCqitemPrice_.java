package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:54.751+0200")
@StaticMetamodel(CuinpCqitemPrice.class)
public class CuinpCqitemPrice_ {
	public static volatile SingularAttribute<CuinpCqitemPrice, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CuinpCqitemPrice, Timestamp> audiTiUpdate;
	public static volatile SingularAttribute<CuinpCqitemPrice, BigDecimal> cqprAmFinalPrice;
	public static volatile SingularAttribute<CuinpCqitemPrice, BigDecimal> cqprAmInitialPrice;
	public static volatile SingularAttribute<CuinpCqitemPrice, BigDecimal> cqprIdCqiPrice;
	public static volatile SingularAttribute<CuinpCqitemPrice, Boolean> cqprInIsRecurring;
	public static volatile SingularAttribute<CuinpCqitemPrice, Long> pofpIdProductOfferingPrice;
	public static volatile SingularAttribute<CuinpCqitemPrice, BigDecimal> userIdCreatorParty;
	public static volatile SingularAttribute<CuinpCqitemPrice, BigDecimal> userIdUpdaterParty;
	public static volatile SingularAttribute<CuinpCqitemPrice, CorddUnitMeasure> corddUnitMeasure1;
	public static volatile SingularAttribute<CuinpCqitemPrice, CorddUnitMeasure> corddUnitMeasure2;
	public static volatile ListAttribute<CuinpCqitemPrice, CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations;
	public static volatile SingularAttribute<CuinpCqitemPrice, CuinpCustomerQuoteItem> cuinpCustomerQuoteItem;
}
