package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:53.876+0200")
@StaticMetamodel(CorddUnitMeasure.class)
public class CorddUnitMeasure_ {
	public static volatile SingularAttribute<CorddUnitMeasure, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CorddUnitMeasure, Timestamp> audiTiUpdate;
	public static volatile SingularAttribute<CorddUnitMeasure, Date> unmeDaEndValidity;
	public static volatile SingularAttribute<CorddUnitMeasure, Date> unmeDaStartValidity;
	public static volatile SingularAttribute<CorddUnitMeasure, Long> unmeIdUnitMeasure;
	public static volatile SingularAttribute<CorddUnitMeasure, String> unmeNaUnitMeasure;
	public static volatile SingularAttribute<CorddUnitMeasure, BigDecimal> userIdCreatorParty;
	public static volatile SingularAttribute<CorddUnitMeasure, BigDecimal> userIdUpdaterParty;
	public static volatile ListAttribute<CorddUnitMeasure, CordpCustomerSellingItem> cordpCustomerSellingItems;
	public static volatile ListAttribute<CorddUnitMeasure, CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations1;
	public static volatile ListAttribute<CorddUnitMeasure, CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations2;
	public static volatile ListAttribute<CorddUnitMeasure, CuinpCqitemPrice> cuinpCqitemPrices1;
	public static volatile ListAttribute<CorddUnitMeasure, CuinpCqitemPrice> cuinpCqitemPrices2;
}
