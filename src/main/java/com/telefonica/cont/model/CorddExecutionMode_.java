package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.573+0200")
@StaticMetamodel(CorddExecutionMode.class)
public class CorddExecutionMode_ {
    public static volatile SingularAttribute<CorddExecutionMode, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddExecutionMode, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddExecutionMode, Long> exmoIdExecutionMode;
    public static volatile SingularAttribute<CorddExecutionMode, String> exmoNaExecutionMode;
    public static volatile SingularAttribute<CorddExecutionMode, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddExecutionMode, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddExecutionMode, CordpCustomerSellingItem> cordpCustomerSellingItems;
}
