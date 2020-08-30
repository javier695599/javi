package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.570+0200")
@StaticMetamodel(CuinrCsellingTypeState.class)
public class CuinrCsellingTypeState_ {
    public static volatile SingularAttribute<CuinrCsellingTypeState, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuinrCsellingTypeState, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuinrCsellingTypeState, Long> csreIdCsellingTypeState;
    public static volatile SingularAttribute<CuinrCsellingTypeState, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuinrCsellingTypeState, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CuinrCsellingTypeState, CorddCsellingState> corddCsellingState;
    public static volatile SingularAttribute<CuinrCsellingTypeState, CuindCsellingStateReason> cuindCsellingStateReason;
}
