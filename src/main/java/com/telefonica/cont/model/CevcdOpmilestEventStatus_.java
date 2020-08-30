package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.206+0200")
@StaticMetamodel(CevcdOpmilestEventStatus.class)
public class CevcdOpmilestEventStatus_ {
    public static volatile SingularAttribute<CevcdOpmilestEventStatus, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcdOpmilestEventStatus, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcdOpmilestEventStatus, Date> oestDaEndValidity;
    public static volatile SingularAttribute<CevcdOpmilestEventStatus, Date> oestDaStartValidity;
    public static volatile SingularAttribute<CevcdOpmilestEventStatus, Long> oestIdOpmilestEventStatus;
    public static volatile SingularAttribute<CevcdOpmilestEventStatus, String> oestNaOpmilestEventStatus;
    public static volatile SingularAttribute<CevcdOpmilestEventStatus, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcdOpmilestEventStatus, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcdOpmilestEventStatus, CevcrOpmilestEventStMove> cevcrOpmilestEventStMoves;
}
