package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.190+0200")
@StaticMetamodel(CevcdDateScheduleType.class)
public class CevcdDateScheduleType_ {
    public static volatile SingularAttribute<CevcdDateScheduleType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcdDateScheduleType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcdDateScheduleType, Date> dsctDaEndValidity;
    public static volatile SingularAttribute<CevcdDateScheduleType, Date> dsctDaStartValidity;
    public static volatile SingularAttribute<CevcdDateScheduleType, String> dsctDsDateScheduleType;
    public static volatile SingularAttribute<CevcdDateScheduleType, Long> dsctIdDateScheduleType;
    public static volatile SingularAttribute<CevcdDateScheduleType, String> dsctNaDateScheduleType;
    public static volatile SingularAttribute<CevcdDateScheduleType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcdDateScheduleType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcdDateScheduleType, CevcrOptaskSchedule> cevcrOptaskSchedules;
}
