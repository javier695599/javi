package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.018+0200")
@StaticMetamodel(AgreaCagreeAuthoriza.class)
public class AgreaCagreeAuthoriza_ {
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, Timestamp> agatTiEndAgreeAuthoriza;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, Timestamp> agatTiStartAgreeAuthoriza;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, BigDecimal> cautIdCagreeAuthoriza;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, AgredAgreeSignatRepresent> agredAgreeSignatRepresent;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, AgredCagreeAuthorizStatus> agredCagreeAuthorizStatus;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, AgrepCagreeApproval> agrepCagreeApproval;
    public static volatile SingularAttribute<AgreaCagreeAuthoriza, CordpCustomerSellingRole> cordpCustomerSellingRole;
}
