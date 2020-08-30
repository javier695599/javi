package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.898+0200")
@StaticMetamodel(CordrCsitemDateType.class)
public class CordrCsitemDateType_ {
    public static volatile SingularAttribute<CordrCsitemDateType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsitemDateType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsitemDateType, Long> dbasIdCsitemDateType;
    public static volatile SingularAttribute<CordrCsitemDateType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsitemDateType, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsitemDateType, CorddCsellingItemType> corddCsellingItemType;
    public static volatile SingularAttribute<CordrCsitemDateType, CorddDateScheduleType> corddDateScheduleType;
    public static volatile ListAttribute<CordrCsitemDateType, CordrCsellingItemSchedule> cordrCsellingItemSchedules;
}
