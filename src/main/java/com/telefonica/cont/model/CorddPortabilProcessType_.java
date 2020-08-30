package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.589+0200")
@StaticMetamodel(CorddPortabilProcessType.class)
public class CorddPortabilProcessType_ {
    public static volatile SingularAttribute<CorddPortabilProcessType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddPortabilProcessType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddPortabilProcessType, Date> portDaEndValidity;
    public static volatile SingularAttribute<CorddPortabilProcessType, Date> portDaStartValidity;
    public static volatile SingularAttribute<CorddPortabilProcessType, Long> portIdPortabilProcessType;
    public static volatile SingularAttribute<CorddPortabilProcessType, String> portNaPortabilProcessType;
    public static volatile SingularAttribute<CorddPortabilProcessType, Long> portQuMarginDeadline;
    public static volatile SingularAttribute<CorddPortabilProcessType, Long> portQuTimeDeadline;
    public static volatile SingularAttribute<CorddPortabilProcessType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddPortabilProcessType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddPortabilProcessType, CuinpCustomerQuoteItem> cuinpCustomerQuoteItems;
}
