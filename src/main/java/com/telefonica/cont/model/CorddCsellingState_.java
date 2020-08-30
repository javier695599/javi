package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.545+0200")
@StaticMetamodel(CorddCsellingState.class)
public class CorddCsellingState_ {
    public static volatile SingularAttribute<CorddCsellingState, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCsellingState, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCsellingState, Date> csstDaEndValidity;
    public static volatile SingularAttribute<CorddCsellingState, Date> csstDaStartValidity;
    public static volatile SingularAttribute<CorddCsellingState, Long> csstIdCsellingState;
    public static volatile SingularAttribute<CorddCsellingState, String> cuslDsCsellingStateLang;
    public static volatile SingularAttribute<CorddCsellingState, String> cuslNaCsellingStateLang;
    public static volatile SingularAttribute<CorddCsellingState, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCsellingState, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddCsellingState, CordrCsellingStateLang> cordrCsellingStateLangs;
    public static volatile ListAttribute<CorddCsellingState, CordrCsellingStateRela> cordrCsellingStateRelas;
    public static volatile ListAttribute<CorddCsellingState, CuinrCsellingTypeState> cuinrCsellingTypeStates;
}
