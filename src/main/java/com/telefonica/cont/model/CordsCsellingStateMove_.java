package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.070+0200")
@StaticMetamodel(CordsCsellingStateMove.class)
public class CordsCsellingStateMove_ {
    public static volatile SingularAttribute<CordsCsellingStateMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsellingStateMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsellingStateMove, Long> bintIdCsellingType;
    public static volatile SingularAttribute<CordsCsellingStateMove, Date> bismDaEndValidity;
    public static volatile SingularAttribute<CordsCsellingStateMove, Date> bismDaStartValidity;
    public static volatile SingularAttribute<CordsCsellingStateMove, BigDecimal> buinIdCustomerSelling;
    public static volatile SingularAttribute<CordsCsellingStateMove, Long> cschIdCsellingStateReason;
    public static volatile SingularAttribute<CordsCsellingStateMove, BigDecimal> cssmIdCsellingStateMove;
    public static volatile SingularAttribute<CordsCsellingStateMove, Long> csstIdCsellingState;
    public static volatile SingularAttribute<CordsCsellingStateMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsellingStateMove, BigDecimal> userIdUpdaterParty;
}
