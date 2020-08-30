package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.487+0200")
@StaticMetamodel(CordaCustomerSelling.class)
public class CordaCustomerSelling_ {
    public static volatile SingularAttribute<CordaCustomerSelling, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordaCustomerSelling, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordaCustomerSelling, Long> bintIdCsellingType;
    public static volatile SingularAttribute<CordaCustomerSelling, BigDecimal> buinIdCustomerSelling;
    public static volatile SingularAttribute<CordaCustomerSelling, Timestamp> csinTiDateConsolidation;
    public static volatile SingularAttribute<CordaCustomerSelling, Timestamp> csinTiDateFinalState;
    public static volatile SingularAttribute<CordaCustomerSelling, Timestamp> csinTiDateHistorification;
    public static volatile SingularAttribute<CordaCustomerSelling, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordaCustomerSelling, BigDecimal> userIdUpdaterParty;
}
