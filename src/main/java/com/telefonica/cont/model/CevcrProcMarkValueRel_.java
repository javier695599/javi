package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.425+0200")
@StaticMetamodel(CevcrProcMarkValueRel.class)
public class CevcrProcMarkValueRel_ {
    public static volatile SingularAttribute<CevcrProcMarkValueRel, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, Date> pmvrDaEndValidity;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, Date> pmvrDaStartValidity;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, Long> pmvrIdProcMarkValueRel;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, Long> pmvrNuSequence;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, CevcpProcMarkValue> cevcpProcMarkValue1;
    public static volatile SingularAttribute<CevcrProcMarkValueRel, CevcpProcMarkValue> cevcpProcMarkValue2;
}
