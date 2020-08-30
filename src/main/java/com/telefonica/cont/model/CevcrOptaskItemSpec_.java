package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.331+0200")
@StaticMetamodel(CevcrOptaskItemSpec.class)
public class CevcrOptaskItemSpec_ {
    public static volatile SingularAttribute<CevcrOptaskItemSpec, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOptaskItemSpec, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOptaskItemSpec, Long> iwstIdIwflowSpTask;
    public static volatile SingularAttribute<CevcrOptaskItemSpec, BigDecimal> opshIdOptaskItemSpec;
    public static volatile SingularAttribute<CevcrOptaskItemSpec, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOptaskItemSpec, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOptaskItemSpec, CevcpOplanTask> cevcpOplanTask;
}
