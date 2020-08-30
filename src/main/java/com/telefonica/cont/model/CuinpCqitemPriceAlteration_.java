package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:54.751+0200")
@StaticMetamodel(CuinpCqitemPriceAlteration.class)
public class CuinpCqitemPriceAlteration_ {
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, Timestamp> audiTiUpdate;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, BigDecimal> cpalAmPrice;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, BigDecimal> cpalIdCqiPriceAlteration;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, Boolean> cpalInIsAlternate;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, Boolean> cpalInIsPercentage;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, Long> cpalNuApplicationDuration;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, Long> cpalPtPercentage;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, Long> pofpIdProductOfferingPrice;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, BigDecimal> userIdCreatorParty;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, BigDecimal> userIdUpdaterParty;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, CorddUnitMeasure> corddUnitMeasure1;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, CorddUnitMeasure> corddUnitMeasure2;
	public static volatile SingularAttribute<CuinpCqitemPriceAlteration, CuinpCqitemPrice> cuinpCqitemPrice;
}
