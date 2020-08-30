package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.143+0200")
@StaticMetamodel(AgrerCagreeItemGoverned.class)
public class AgrerCagreeItemGoverned_ {
    public static volatile SingularAttribute<AgrerCagreeItemGoverned, BigDecimal> aigbIdCagreeItemGoverned;
    public static volatile SingularAttribute<AgrerCagreeItemGoverned, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgrerCagreeItemGoverned, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgrerCagreeItemGoverned, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgrerCagreeItemGoverned, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<AgrerCagreeItemGoverned, AgrepCagreeTermOrCond> agrepCagreeTermOrCond;
    public static volatile SingularAttribute<AgrerCagreeItemGoverned, AgrepCustomerAgreementIt> agrepCustomerAgreementIt;
}
