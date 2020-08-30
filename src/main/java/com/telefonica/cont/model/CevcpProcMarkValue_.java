package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.284+0200")
@StaticMetamodel(CevcpProcMarkValue.class)
public class CevcpProcMarkValue_ {
    public static volatile SingularAttribute<CevcpProcMarkValue, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcpProcMarkValue, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcpProcMarkValue, Date> pmvaDaEndValidity;
    public static volatile SingularAttribute<CevcpProcMarkValue, Date> pmvaDaStartValidity;
    public static volatile SingularAttribute<CevcpProcMarkValue, String> pmvaDsProcMarkValue;
    public static volatile SingularAttribute<CevcpProcMarkValue, Long> pmvaIdProcMarkValue;
    public static volatile SingularAttribute<CevcpProcMarkValue, String> pmvaNaProcMarkValue;
    public static volatile SingularAttribute<CevcpProcMarkValue, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcpProcMarkValue, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcpProcMarkValue, CevcrProcMarkValueRel> cevcrProcMarkValueRels1;
    public static volatile ListAttribute<CevcpProcMarkValue, CevcrProcMarkValueRel> cevcrProcMarkValueRels2;
    public static volatile ListAttribute<CevcpProcMarkValue, CevcrProcMarkValueUse> cevcrProcMarkValueUses;
}
