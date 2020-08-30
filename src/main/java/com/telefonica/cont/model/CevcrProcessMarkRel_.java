package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.425+0200")
@StaticMetamodel(CevcrProcessMarkRel.class)
public class CevcrProcessMarkRel_ {
    public static volatile SingularAttribute<CevcrProcessMarkRel, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrProcessMarkRel, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrProcessMarkRel, Date> pmreDaEndValidity;
    public static volatile SingularAttribute<CevcrProcessMarkRel, Date> pmreDaStartValidity;
    public static volatile SingularAttribute<CevcrProcessMarkRel, Long> pmreIdProcessMarkRel;
    public static volatile SingularAttribute<CevcrProcessMarkRel, Long> pmreNuSequentialOrder;
    public static volatile SingularAttribute<CevcrProcessMarkRel, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrProcessMarkRel, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrProcessMarkRel, CevcpProcessMark> cevcpProcessMark1;
    public static volatile SingularAttribute<CevcrProcessMarkRel, CevcpProcessMark> cevcpProcessMark2;
}
