package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.472+0200")
@StaticMetamodel(CordaCsitemStateMoveOb.class)
public class CordaCsitemStateMoveOb_ {
    public static volatile SingularAttribute<CordaCsitemStateMoveOb, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordaCsitemStateMoveOb, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordaCsitemStateMoveOb, BigDecimal> ciobIdCsitemStateMoveOb;
    public static volatile SingularAttribute<CordaCsitemStateMoveOb, String> ciobObCsitemStateMoveOb;
    public static volatile SingularAttribute<CordaCsitemStateMoveOb, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordaCsitemStateMoveOb, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordaCsitemStateMoveOb, CordaCsitemStateMove> cordaCsitemStateMove;
}
