package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:55.064+0200")
@StaticMetamodel(CuinrCqitemRelProdPromoted.class)
public class CuinrCqitemRelProdPromoted_ {
	public static volatile SingularAttribute<CuinrCqitemRelProdPromoted, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CuinrCqitemRelProdPromoted, Timestamp> audiTiUpdate;
	public static volatile SingularAttribute<CuinrCqitemRelProdPromoted, BigDecimal> userIdCreatorParty;
	public static volatile SingularAttribute<CuinrCqitemRelProdPromoted, BigDecimal> userIdUpdaterParty;
	public static volatile SingularAttribute<CuinrCqitemRelProdPromoted, CuinpCustomerQuoteItem> cuinpCustomerQuoteItem;
	public static volatile SingularAttribute<CuinrCqitemRelProdPromoted, CuinrCqitemRelProdPromotedPK> id;
}
