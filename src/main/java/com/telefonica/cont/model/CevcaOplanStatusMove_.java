package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.159+0200")
@StaticMetamodel(CevcaOplanStatusMove.class)
public class CevcaOplanStatusMove_ {
    public static volatile SingularAttribute<CevcaOplanStatusMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcaOplanStatusMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcaOplanStatusMove, BigDecimal> opsmIdOplanStatusMove;
    public static volatile SingularAttribute<CevcaOplanStatusMove, Timestamp> opsmTiEndValidity;
    public static volatile SingularAttribute<CevcaOplanStatusMove, Timestamp> opsmTiStartValidity;
    public static volatile SingularAttribute<CevcaOplanStatusMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcaOplanStatusMove, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcaOplanStatusMove, CevcdOplanStatus> cevcdOplanStatus;
    public static volatile SingularAttribute<CevcaOplanStatusMove, CevcpOrchestrationPlan> cevcpOrchestrationPlan;
}
