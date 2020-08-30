package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.300+0200")
@StaticMetamodel(CevcrOpmilestEvent.class)
public class CevcrOpmilestEvent_ {
    public static volatile SingularAttribute<CevcrOpmilestEvent, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOpmilestEvent, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOpmilestEvent, Long> iwmeIdIwflowSpMilestEvent;
    public static volatile SingularAttribute<CevcrOpmilestEvent, BigDecimal> opmeIdOpmilestEvent;
    public static volatile SingularAttribute<CevcrOpmilestEvent, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOpmilestEvent, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOpmilestEvent, CevcpOplanMileston> cevcpOplanMileston1;
    public static volatile SingularAttribute<CevcrOpmilestEvent, CevcpOplanMileston> cevcpOplanMileston2;
    public static volatile ListAttribute<CevcrOpmilestEvent, CevcrOpmilestEventStMove> cevcrOpmilestEventStMoves;
}
