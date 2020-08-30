package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.456+0200")
@StaticMetamodel(CordaCsellingStateMoveOb.class)
public class CordaCsellingStateMoveOb_ {
    public static volatile SingularAttribute<CordaCsellingStateMoveOb, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordaCsellingStateMoveOb, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordaCsellingStateMoveOb, BigDecimal> csobIdCsellingStateMoveOb;
    public static volatile SingularAttribute<CordaCsellingStateMoveOb, String> csobObCsellingStateMoveOb;
    public static volatile SingularAttribute<CordaCsellingStateMoveOb, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordaCsellingStateMoveOb, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordaCsellingStateMoveOb, CordaCsellingStateMove> cordaCsellingStateMove;
}
