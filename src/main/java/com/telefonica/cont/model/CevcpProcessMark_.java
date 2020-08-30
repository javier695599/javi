package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.268+0200")
@StaticMetamodel(CevcpProcessMark.class)
public class CevcpProcessMark_ {
    public static volatile SingularAttribute<CevcpProcessMark, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcpProcessMark, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcpProcessMark, Date> pmraDaEndValidity;
    public static volatile SingularAttribute<CevcpProcessMark, Date> prmaDaStartValidity;
    public static volatile SingularAttribute<CevcpProcessMark, String> prmaDsProcessMark;
    public static volatile SingularAttribute<CevcpProcessMark, Long> prmaIdProcessMark;
    public static volatile SingularAttribute<CevcpProcessMark, String> prmaNaProcessMark;
    public static volatile SingularAttribute<CevcpProcessMark, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcpProcessMark, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcpProcessMark, CevcrProcessMarkRel> cevcrProcessMarkRels1;
    public static volatile ListAttribute<CevcpProcessMark, CevcrProcessMarkRel> cevcrProcessMarkRels2;
    public static volatile ListAttribute<CevcpProcessMark, CevcrProcMarkValueUse> cevcrProcMarkValueUses;
}
