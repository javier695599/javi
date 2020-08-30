package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.682+0200")
@StaticMetamodel(CordrCsellingIncident.class)
public class CordrCsellingIncident_ {
    public static volatile SingularAttribute<CordrCsellingIncident, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingIncident, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingIncident, BigDecimal> cseiIdCsellingIncident;
    public static volatile SingularAttribute<CordrCsellingIncident, Long> inciIdIncident;
    public static volatile SingularAttribute<CordrCsellingIncident, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingIncident, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingIncident, CordpCustomerSelling> cordpCustomerSelling;
}
