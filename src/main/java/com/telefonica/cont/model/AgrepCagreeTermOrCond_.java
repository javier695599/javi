package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.050+0200")
@StaticMetamodel(AgrepCagreeTermOrCond.class)
public class AgrepCagreeTermOrCond_ {
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, String> atocCoCagreeTermOrCond;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, Date> atocDaEndValidity;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, Timestamp> atocDaSpecReference;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, Date> atocDaStartValidity;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, BigDecimal> atocIdCagreeTermOrCond;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, Long> pofpIdProductOfferingPrice;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, Long> poteIdProductOfferingTerm;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<AgrepCagreeTermOrCond, AgrepCustomerAgreement> agrepCustomerAgreement;
    public static volatile ListAttribute<AgrepCagreeTermOrCond, AgrerCagreeItemGoverned> agrerCagreeItemGoverneds;
}
