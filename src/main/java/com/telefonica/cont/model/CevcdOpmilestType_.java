package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.222+0200")
@StaticMetamodel(CevcdOpmilestType.class)
public class CevcdOpmilestType_ {
    public static volatile SingularAttribute<CevcdOpmilestType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcdOpmilestType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcdOpmilestType, Long> opmtIdOpmilestType;
    public static volatile SingularAttribute<CevcdOpmilestType, String> opmtNaOpmilestType;
    public static volatile SingularAttribute<CevcdOpmilestType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcdOpmilestType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcdOpmilestType, CevcpOplanMileston> cevcpOplanMilestons;
}
