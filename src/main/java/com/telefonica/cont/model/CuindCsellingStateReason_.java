package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.492+0200")
@StaticMetamodel(CuindCsellingStateReason.class)
public class CuindCsellingStateReason_ {
    public static volatile SingularAttribute<CuindCsellingStateReason, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuindCsellingStateReason, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuindCsellingStateReason, String> cschCoCsellingStateReason;
    public static volatile SingularAttribute<CuindCsellingStateReason, Date> cschDaEndValidity;
    public static volatile SingularAttribute<CuindCsellingStateReason, Date> cschDaStartValidity;
    public static volatile SingularAttribute<CuindCsellingStateReason, String> cschDsCsellingStateReason;
    public static volatile SingularAttribute<CuindCsellingStateReason, Long> cschIdCsellingStateReason;
    public static volatile SingularAttribute<CuindCsellingStateReason, Boolean> cschInProduceRetry;
    public static volatile SingularAttribute<CuindCsellingStateReason, String> cschNaCsellingStateReason;
    public static volatile SingularAttribute<CuindCsellingStateReason, Long> cschQuRetryThresold;
    public static volatile SingularAttribute<CuindCsellingStateReason, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuindCsellingStateReason, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CuindCsellingStateReason, CordaCsellingStateMove> cordaCsellingStateMoves;
    public static volatile ListAttribute<CuindCsellingStateReason, CordaCsitemStateMove> cordaCsitemStateMoves;
    public static volatile ListAttribute<CuindCsellingStateReason, CordaCsitemSubstatMove> cordaCsitemSubstatMoves;
    public static volatile SingularAttribute<CuindCsellingStateReason, CuindCsellingStateReason> cuindCsellingStateReason;
    public static volatile ListAttribute<CuindCsellingStateReason, CuindCsellingStateReason> cuindCsellingStateReasons;
    public static volatile ListAttribute<CuindCsellingStateReason, CuinrCsellingStateInvolve> cuinrCsellingStateInvolves;
    public static volatile ListAttribute<CuindCsellingStateReason, CuinrCsellingTypeState> cuinrCsellingTypeStates;
}
