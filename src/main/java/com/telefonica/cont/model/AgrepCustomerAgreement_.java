package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.112+0200")
@StaticMetamodel(AgrepCustomerAgreement.class)
public class AgrepCustomerAgreement_ {
    public static volatile SingularAttribute<AgrepCustomerAgreement, String> agreCoAgreement;
    public static volatile SingularAttribute<AgrepCustomerAgreement, Date> agreDaEndPeriod;
    public static volatile SingularAttribute<AgrepCustomerAgreement, Date> agreDaStartPeriod;
    public static volatile SingularAttribute<AgrepCustomerAgreement, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgrepCustomerAgreement, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgrepCustomerAgreement, BigDecimal> buinIdCustomerAgreement;
    public static volatile SingularAttribute<AgrepCustomerAgreement, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgrepCustomerAgreement, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<AgrepCustomerAgreement, AgrepCagreeTermOrCond> agrepCagreeTermOrConds;
    public static volatile ListAttribute<AgrepCustomerAgreement, AgrepCustomerAgreementIt> agrepCustomerAgreementIts;
    public static volatile SingularAttribute<AgrepCustomerAgreement, CordpCustomerSelling> cordpCustomerSelling;
}
