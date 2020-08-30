package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.836+0200")
@StaticMetamodel(CordrCsellingRoleAssoc.class)
public class CordrCsellingRoleAssoc_ {
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, Date> csraDaEndValidity;
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, Date> csraDaStartValidity;
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, BigDecimal> csraIdCsellingRoleAssoc;
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, CordpCustomerSellingItem> cordpCustomerSellingItem;
    public static volatile SingularAttribute<CordrCsellingRoleAssoc, CordpCustomerSellingRole> cordpCustomerSellingRole;
}
