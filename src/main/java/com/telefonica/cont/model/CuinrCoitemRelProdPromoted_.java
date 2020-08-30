package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:55.032+0200")
@StaticMetamodel(CuinrCoitemRelProdPromoted.class)
public class CuinrCoitemRelProdPromoted_ {
	public static volatile SingularAttribute<CuinrCoitemRelProdPromoted, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CuinrCoitemRelProdPromoted, Timestamp> audiTiUpdate;
	public static volatile SingularAttribute<CuinrCoitemRelProdPromoted, BigDecimal> userIdCreatorParty;
	public static volatile SingularAttribute<CuinrCoitemRelProdPromoted, BigDecimal> userIdUpdaterParty;
	public static volatile SingularAttribute<CuinrCoitemRelProdPromoted, CordpCustomerOrderItem> cordpCustomerOrderItem;
	public static volatile SingularAttribute<CuinrCoitemRelProdPromoted, CuinrCoitemRelProdPromotedPK> id;
}
