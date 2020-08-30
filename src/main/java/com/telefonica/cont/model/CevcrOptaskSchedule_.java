package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.347+0200")
@StaticMetamodel(CevcrOptaskSchedule.class)
public class CevcrOptaskSchedule_ {
    public static volatile SingularAttribute<CevcrOptaskSchedule, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOptaskSchedule, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOptaskSchedule, BigDecimal> opscIdOptaskSchedule;
    public static volatile SingularAttribute<CevcrOptaskSchedule, Timestamp> opscTiOptaskSchedule;
    public static volatile SingularAttribute<CevcrOptaskSchedule, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOptaskSchedule, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOptaskSchedule, CevcdDateScheduleType> cevcdDateScheduleType;
    public static volatile SingularAttribute<CevcrOptaskSchedule, CevcpOplanTask> cevcpOplanTask;
}
