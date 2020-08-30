package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.557+0200")
@StaticMetamodel(CorddCsellingVersReason.class)
public class CorddCsellingVersReason_ {
    public static volatile SingularAttribute<CorddCsellingVersReason, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCsellingVersReason, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCsellingVersReason, Date> csvrDaEndValidity;
    public static volatile SingularAttribute<CorddCsellingVersReason, Date> csvrDaStartValidity;
    public static volatile SingularAttribute<CorddCsellingVersReason, String> csvrDsCsellingVersReason;
    public static volatile SingularAttribute<CorddCsellingVersReason, Long> csvrIdCsellingVersReason;
    public static volatile SingularAttribute<CorddCsellingVersReason, String> csvrNaCsellingVersReason;
    public static volatile SingularAttribute<CorddCsellingVersReason, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCsellingVersReason, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddCsellingVersReason, CordrCsellingVersionType> cordrCsellingVersionTypes;
}
