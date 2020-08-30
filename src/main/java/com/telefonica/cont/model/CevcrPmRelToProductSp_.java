package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.362+0200")
@StaticMetamodel(CevcrPmRelToProductSp.class)
public class CevcrPmRelToProductSp_ {
    public static volatile SingularAttribute<CevcrPmRelToProductSp, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrPmRelToProductSp, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrPmRelToProductSp, Long> prspIdProductNumber;
    public static volatile SingularAttribute<CevcrPmRelToProductSp, Long> tpspIdPmRelToProductSp;
    public static volatile SingularAttribute<CevcrPmRelToProductSp, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrPmRelToProductSp, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrPmRelToProductSp, CevcrProcMarkValueUse> cevcrProcMarkValueUse;
}
