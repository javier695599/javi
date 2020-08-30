package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.054+0200")
@StaticMetamodel(CordsCsellingItemSchedule.class)
public class CordsCsellingItemSchedule_ {
    public static volatile SingularAttribute<CordsCsellingItemSchedule, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsellingItemSchedule, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsellingItemSchedule, BigDecimal> biitIdCustomerSellingItem;
    public static volatile SingularAttribute<CordsCsellingItemSchedule, Long> csitIdCsellingItemType;
    public static volatile SingularAttribute<CordsCsellingItemSchedule, Long> dastIdDateScheduleType;
    public static volatile SingularAttribute<CordsCsellingItemSchedule, Long> scheIdCsellingItemSchedule;
    public static volatile SingularAttribute<CordsCsellingItemSchedule, Timestamp> scheTiCsellingItemSchedule;
    public static volatile SingularAttribute<CordsCsellingItemSchedule, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsellingItemSchedule, BigDecimal> userIdUpdaterParty;
}
