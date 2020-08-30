package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.573+0200")
@StaticMetamodel(CorddDateScheduleType.class)
public class CorddDateScheduleType_ {
    public static volatile SingularAttribute<CorddDateScheduleType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddDateScheduleType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddDateScheduleType, Date> dastDaEndValidity;
    public static volatile SingularAttribute<CorddDateScheduleType, Date> dastDaStartValidity;
    public static volatile SingularAttribute<CorddDateScheduleType, String> dastDsDateScheduleType;
    public static volatile SingularAttribute<CorddDateScheduleType, Long> dastIdDateScheduleType;
    public static volatile SingularAttribute<CorddDateScheduleType, String> dastNaDateScheduleType;
    public static volatile SingularAttribute<CorddDateScheduleType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddDateScheduleType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddDateScheduleType, CordrCsitemDateType> cordrCsitemDateTypes;
}
