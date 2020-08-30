package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.315+0200")
@StaticMetamodel(CevcrOpmilestEventStMove.class)
public class CevcrOpmilestEventStMove_ {
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, BigDecimal> oehsIdOpmilestEventStMove;
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, Timestamp> oehsTiEndValidity;
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, Timestamp> oehsTiStartValidity;
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, CevcdOpmilestEventStatus> cevcdOpmilestEventStatus;
    public static volatile SingularAttribute<CevcrOpmilestEventStMove, CevcrOpmilestEvent> cevcrOpmilestEvent;
}
