package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.425+0200")
@StaticMetamodel(CevcrProcMarkValueUse.class)
public class CevcrProcMarkValueUse_ {
    public static volatile SingularAttribute<CevcrProcMarkValueUse, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, Date> pmvuDaEndValidity;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, Date> pmvuDaStartValidity;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, String> pmvuDsProcMarkValueUse;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, Long> pmvuIdProcMarkValueUse;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, String> pmvuNaProcMarkValueUse;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, CevcpProcessMark> cevcpProcessMark;
    public static volatile SingularAttribute<CevcrProcMarkValueUse, CevcpProcMarkValue> cevcpProcMarkValue;
    public static volatile ListAttribute<CevcrProcMarkValueUse, CevcrPmGroup> cevcrPmGroups;
    public static volatile ListAttribute<CevcrProcMarkValueUse, CevcrPmRelToProdOff> cevcrPmRelToProdOffs;
    public static volatile ListAttribute<CevcrProcMarkValueUse, CevcrPmRelToProductSp> cevcrPmRelToProductSps;
    public static volatile ListAttribute<CevcrProcMarkValueUse, CevcrPmToProdSpecChar> cevcrPmToProdSpecChars;
}
