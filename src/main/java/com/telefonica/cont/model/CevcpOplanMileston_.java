package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.253+0200")
@StaticMetamodel(CevcpOplanMileston.class)
public class CevcpOplanMileston_ {
    public static volatile SingularAttribute<CevcpOplanMileston, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcpOplanMileston, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcpOplanMileston, BigDecimal> opelIdOplanMileston;
    public static volatile SingularAttribute<CevcpOplanMileston, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcpOplanMileston, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcpOplanMileston, CevcaOpmilestStatusMove> cevcaOpmilestStatusMoves;
    public static volatile SingularAttribute<CevcpOplanMileston, CevcdOpmilestType> cevcdOpmilestType;
    public static volatile SingularAttribute<CevcpOplanMileston, CevcpOplanElement> cevcpOplanElement;
    public static volatile ListAttribute<CevcpOplanMileston, CevcrOpmilestEvent> cevcrOpmilestEvents1;
    public static volatile ListAttribute<CevcpOplanMileston, CevcrOpmilestEvent> cevcrOpmilestEvents2;
    public static volatile ListAttribute<CevcpOplanMileston, CevcrOpmilestItemsSpec> cevcrOpmilestItemsSpecs;
}
