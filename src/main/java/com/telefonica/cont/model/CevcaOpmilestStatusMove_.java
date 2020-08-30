package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.159+0200")
@StaticMetamodel(CevcaOpmilestStatusMove.class)
public class CevcaOpmilestStatusMove_ {
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, BigDecimal> ophsIdOpmilestStatusMove;
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, Timestamp> ophsTiEndValidity;
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, Timestamp> ophsTiStartValidity;
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, CevcdOpmilestStatus> cevcdOpmilestStatus;
    public static volatile SingularAttribute<CevcaOpmilestStatusMove, CevcpOplanMileston> cevcpOplanMileston;
}
