package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.555+0200")
@StaticMetamodel(CuinrCsellingStateInvolve.class)
public class CuinrCsellingStateInvolve_ {
    public static volatile SingularAttribute<CuinrCsellingStateInvolve, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuinrCsellingStateInvolve, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuinrCsellingStateInvolve, Long> cssiIdCsellingStateInvolve;
    public static volatile SingularAttribute<CuinrCsellingStateInvolve, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuinrCsellingStateInvolve, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CuinrCsellingStateInvolve, CorddCsellingItemState> corddCsellingItemState;
    public static volatile SingularAttribute<CuinrCsellingStateInvolve, CuindCsellingStateReason> cuindCsellingStateReason;
}
