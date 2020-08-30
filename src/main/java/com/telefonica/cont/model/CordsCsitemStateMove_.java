package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.086+0200")
@StaticMetamodel(CordsCsitemStateMove.class)
public class CordsCsitemStateMove_ {
    public static volatile SingularAttribute<CordsCsitemStateMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsitemStateMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsitemStateMove, BigDecimal> biitIdCustomerSellingItem;
    public static volatile SingularAttribute<CordsCsitemStateMove, Date> cismDaEndValidity;
    public static volatile SingularAttribute<CordsCsitemStateMove, Date> cismDaStartValidity;
    public static volatile SingularAttribute<CordsCsitemStateMove, BigDecimal> cismIdCsitemStateMove;
    public static volatile SingularAttribute<CordsCsitemStateMove, Long> cschIdCsellingStateReason;
    public static volatile SingularAttribute<CordsCsitemStateMove, Long> csisIdCsellingItemState;
    public static volatile SingularAttribute<CordsCsitemStateMove, Long> csitIdCsellingItemType;
    public static volatile SingularAttribute<CordsCsitemStateMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsitemStateMove, BigDecimal> userIdUpdaterParty;
}
