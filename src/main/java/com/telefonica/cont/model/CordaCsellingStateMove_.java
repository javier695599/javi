package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.456+0200")
@StaticMetamodel(CordaCsellingStateMove.class)
public class CordaCsellingStateMove_ {
    public static volatile SingularAttribute<CordaCsellingStateMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordaCsellingStateMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordaCsellingStateMove, Date> bismDaEndValidity;
    public static volatile SingularAttribute<CordaCsellingStateMove, Date> bismDaStartValidity;
    public static volatile SingularAttribute<CordaCsellingStateMove, BigDecimal> cssmIdCsellingStateMove;
    public static volatile SingularAttribute<CordaCsellingStateMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordaCsellingStateMove, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordaCsellingStateMove, CordaCsellingStateMoveOb> cordaCsellingStateMoveOb;
    public static volatile SingularAttribute<CordaCsellingStateMove, CordpCustomerSelling> cordpCustomerSelling;
    public static volatile SingularAttribute<CordaCsellingStateMove, CordrCsellingStateRela> cordrCsellingStateRela;
    public static volatile SingularAttribute<CordaCsellingStateMove, CuindCsellingStateReason> cuindCsellingStateReason;
}
