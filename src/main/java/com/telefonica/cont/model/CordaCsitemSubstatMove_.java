package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.487+0200")
@StaticMetamodel(CordaCsitemSubstatMove.class)
public class CordaCsitemSubstatMove_ {
    public static volatile SingularAttribute<CordaCsitemSubstatMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, Date> csumDaEndValidity;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, Date> csumDaStartValidity;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, BigDecimal> csumIdCsitemSubstatMove;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, CordpCustomerSellingItem> cordpCustomerSellingItem;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, CordrCsitemSubstateAsso> cordrCsitemSubstateAsso;
    public static volatile SingularAttribute<CordaCsitemSubstatMove, CuindCsellingStateReason> cuindCsellingStateReason;
}
