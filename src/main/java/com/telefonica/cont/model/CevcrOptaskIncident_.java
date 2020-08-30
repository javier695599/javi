package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.331+0200")
@StaticMetamodel(CevcrOptaskIncident.class)
public class CevcrOptaskIncident_ {
    public static volatile SingularAttribute<CevcrOptaskIncident, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOptaskIncident, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOptaskIncident, Long> inciIdIncident;
    public static volatile SingularAttribute<CevcrOptaskIncident, BigDecimal> optiIdOptaskIncident;
    public static volatile SingularAttribute<CevcrOptaskIncident, Long> optiInRaisesSuscribes;
    public static volatile SingularAttribute<CevcrOptaskIncident, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOptaskIncident, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOptaskIncident, CevcpOplanTask> cevcpOplanTask;
}
