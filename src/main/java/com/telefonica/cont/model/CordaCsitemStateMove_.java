package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.472+0200")
@StaticMetamodel(CordaCsitemStateMove.class)
public class CordaCsitemStateMove_ {
    public static volatile SingularAttribute<CordaCsitemStateMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordaCsitemStateMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordaCsitemStateMove, Date> cismDaEndValidity;
    public static volatile SingularAttribute<CordaCsitemStateMove, Date> cismDaStartValidity;
    public static volatile SingularAttribute<CordaCsitemStateMove, BigDecimal> cismIdCsitemStateMove;
    public static volatile SingularAttribute<CordaCsitemStateMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordaCsitemStateMove, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordaCsitemStateMove, CordaCsitemStateMoveOb> cordaCsitemStateMoveOb;
    public static volatile SingularAttribute<CordaCsitemStateMove, CordpCustomerSellingItem> cordpCustomerSellingItem;
    public static volatile SingularAttribute<CordaCsitemStateMove, CordrCsitemTypeAssoc> cordrCsitemTypeAssoc;
    public static volatile SingularAttribute<CordaCsitemStateMove, CuindCsellingStateReason> cuindCsellingStateReason;
}
