package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.034+0200")
@StaticMetamodel(AgrepCagreeApproval.class)
public class AgrepCagreeApproval_ {
    public static volatile SingularAttribute<AgrepCagreeApproval, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgrepCagreeApproval, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgrepCagreeApproval, BigDecimal> buinIdCagreeApproval;
    public static volatile SingularAttribute<AgrepCagreeApproval, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgrepCagreeApproval, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<AgrepCagreeApproval, AgreaCagreeAuthoriza> agreaCagreeAuthorizas;
    public static volatile SingularAttribute<AgrepCagreeApproval, CordpCustomerSelling> cordpCustomerSelling;
}
