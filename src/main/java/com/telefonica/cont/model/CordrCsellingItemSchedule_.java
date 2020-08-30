package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.729+0200")
@StaticMetamodel(CordrCsellingItemSchedule.class)
public class CordrCsellingItemSchedule_ {
    public static volatile SingularAttribute<CordrCsellingItemSchedule, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingItemSchedule, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingItemSchedule, Long> scheIdCsellingItemSchedule;
    public static volatile SingularAttribute<CordrCsellingItemSchedule, Timestamp> scheTiCsellingItemSchedule;
    public static volatile SingularAttribute<CordrCsellingItemSchedule, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingItemSchedule, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingItemSchedule, CordpCustomerSellingItem> cordpCustomerSellingItem;
    public static volatile SingularAttribute<CordrCsellingItemSchedule, CordrCsitemDateType> cordrCsitemDateType;
}
