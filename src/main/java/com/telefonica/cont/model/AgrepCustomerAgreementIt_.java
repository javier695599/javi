package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.128+0200")
@StaticMetamodel(AgrepCustomerAgreementIt.class)
public class AgrepCustomerAgreementIt_ {
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, BigDecimal> biitIdCustomerAgreementIt;
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, String> caitCoCustomerAgreementIt;
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, Date> caitDaCreationCagrreItem;
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, AgrepCustomerAgreement> agrepCustomerAgreement;
    public static volatile ListAttribute<AgrepCustomerAgreementIt, AgrerCagreeItemGoverned> agrerCagreeItemGoverneds;
    public static volatile SingularAttribute<AgrepCustomerAgreementIt, CordpCustomerSellingItem> cordpCustomerSellingItem;
}
