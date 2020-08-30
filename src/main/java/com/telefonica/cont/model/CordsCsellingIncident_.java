package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.008+0200")
@StaticMetamodel(CordsCsellingIncident.class)
public class CordsCsellingIncident_ {
    public static volatile SingularAttribute<CordsCsellingIncident, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsellingIncident, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsellingIncident, Long> bintIdCsellingType;
    public static volatile SingularAttribute<CordsCsellingIncident, BigDecimal> buinIdCustomerSelling;
    public static volatile SingularAttribute<CordsCsellingIncident, BigDecimal> cseiIdCsellingIncident;
    public static volatile SingularAttribute<CordsCsellingIncident, Long> inciIdIncident;
    public static volatile SingularAttribute<CordsCsellingIncident, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsellingIncident, BigDecimal> userIdUpdaterParty;
}
