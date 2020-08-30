package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.222+0200")
@StaticMetamodel(CevcdOpmilestStatus.class)
public class CevcdOpmilestStatus_ {
    public static volatile SingularAttribute<CevcdOpmilestStatus, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcdOpmilestStatus, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcdOpmilestStatus, Date> opmsDaEndValidity;
    public static volatile SingularAttribute<CevcdOpmilestStatus, Date> opmsDaStartValidity;
    public static volatile SingularAttribute<CevcdOpmilestStatus, Long> opmsIdOpmilestStatus;
    public static volatile SingularAttribute<CevcdOpmilestStatus, String> opmsNaOpmilestStatus;
    public static volatile SingularAttribute<CevcdOpmilestStatus, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcdOpmilestStatus, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcdOpmilestStatus, CevcaOpmilestStatusMove> cevcaOpmilestStatusMoves;
}
