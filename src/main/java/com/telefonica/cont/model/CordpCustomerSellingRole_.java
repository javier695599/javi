package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.635+0200")
@StaticMetamodel(CordpCustomerSellingRole.class)
public class CordpCustomerSellingRole_ {
    public static volatile SingularAttribute<CordpCustomerSellingRole, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordpCustomerSellingRole, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordpCustomerSellingRole, Date> csioDaEndValidity;
    public static volatile SingularAttribute<CordpCustomerSellingRole, Date> csioDaStartValidity;
    public static volatile SingularAttribute<CordpCustomerSellingRole, BigDecimal> csioIdClassRole;
    public static volatile SingularAttribute<CordpCustomerSellingRole, BigDecimal> csioIdCustomerSellingRole;
    public static volatile SingularAttribute<CordpCustomerSellingRole, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordpCustomerSellingRole, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CordpCustomerSellingRole, AgreaCagreeAuthoriza> agreaCagreeAuthorizas;
    public static volatile SingularAttribute<CordpCustomerSellingRole, CorddCsellingRoleClass> corddCsellingRoleClass;
    public static volatile SingularAttribute<CordpCustomerSellingRole, CorddCsellingRoleType> corddCsellingRoleType;
    public static volatile SingularAttribute<CordpCustomerSellingRole, CordpCustomerSelling> cordpCustomerSelling;
    public static volatile ListAttribute<CordpCustomerSellingRole, CordrCsellingRoleAssoc> cordrCsellingRoleAssocs;
}
