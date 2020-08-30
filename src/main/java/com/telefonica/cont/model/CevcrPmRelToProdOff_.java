package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.362+0200")
@StaticMetamodel(CevcrPmRelToProdOff.class)
public class CevcrPmRelToProdOff_ {
    public static volatile SingularAttribute<CevcrPmRelToProdOff, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrPmRelToProdOff, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrPmRelToProdOff, Long> profIdProductOffering;
    public static volatile SingularAttribute<CevcrPmRelToProdOff, Long> tpofIdPmRelToProdOff;
    public static volatile SingularAttribute<CevcrPmRelToProdOff, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrPmRelToProdOff, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrPmRelToProdOff, CevcrProcMarkValueUse> cevcrProcMarkValueUse;
}
