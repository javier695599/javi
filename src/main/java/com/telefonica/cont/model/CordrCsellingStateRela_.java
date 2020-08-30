package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.867+0200")
@StaticMetamodel(CordrCsellingStateRela.class)
public class CordrCsellingStateRela_ {
    public static volatile SingularAttribute<CordrCsellingStateRela, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingStateRela, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingStateRela, Date> cssrDaEndValidity;
    public static volatile SingularAttribute<CordrCsellingStateRela, Date> cssrDaStartValidity;
    public static volatile SingularAttribute<CordrCsellingStateRela, Long> cssrIdCsellingStateRela;
    public static volatile SingularAttribute<CordrCsellingStateRela, Boolean> cssrInFinalState;
    public static volatile SingularAttribute<CordrCsellingStateRela, Boolean> cssrInViewable;
    public static volatile SingularAttribute<CordrCsellingStateRela, Long> cssrNuOrderViewable;
    public static volatile SingularAttribute<CordrCsellingStateRela, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingStateRela, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CordrCsellingStateRela, CordaCsellingStateMove> cordaCsellingStateMoves;
    public static volatile SingularAttribute<CordrCsellingStateRela, CorddCsellingState> corddCsellingState;
    public static volatile SingularAttribute<CordrCsellingStateRela, CorddCsellingType> corddCsellingType;
}
