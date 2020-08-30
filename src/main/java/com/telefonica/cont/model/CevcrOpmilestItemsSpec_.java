package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.315+0200")
@StaticMetamodel(CevcrOpmilestItemsSpec.class)
public class CevcrOpmilestItemsSpec_ {
    public static volatile SingularAttribute<CevcrOpmilestItemsSpec, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOpmilestItemsSpec, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOpmilestItemsSpec, Long> iwsmIdIwflowSpMilest;
    public static volatile SingularAttribute<CevcrOpmilestItemsSpec, BigDecimal> omisIdOpmilestItemsSpec;
    public static volatile SingularAttribute<CevcrOpmilestItemsSpec, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOpmilestItemsSpec, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOpmilestItemsSpec, CevcpOplanMileston> cevcpOplanMileston;
}
