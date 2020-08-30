package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.620+0200")
@StaticMetamodel(CordpCustomerSelling.class)
public class CordpCustomerSelling_ {
    public static volatile SingularAttribute<CordpCustomerSelling, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordpCustomerSelling, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordpCustomerSelling, String> buinCoCustomerSelling;
    public static volatile SingularAttribute<CordpCustomerSelling, BigDecimal> buinIdCustomerSelling;
    public static volatile SingularAttribute<CordpCustomerSelling, Timestamp> buinTiCompleteInterac;
    public static volatile SingularAttribute<CordpCustomerSelling, Timestamp> buinTiStartInterac;
    public static volatile SingularAttribute<CordpCustomerSelling, String> lcorDsCustomerSellingLang;
    public static volatile SingularAttribute<CordpCustomerSelling, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordpCustomerSelling, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordpCustomerSelling, AgrepCagreeApproval> agrepCagreeApproval;
    public static volatile SingularAttribute<CordpCustomerSelling, AgrepCustomerAgreement> agrepCustomerAgreement;
    public static volatile ListAttribute<CordpCustomerSelling, AgrerCsellingAttachment> agrerCsellingAttachments;
    public static volatile ListAttribute<CordpCustomerSelling, CordaCsellingStateMove> cordaCsellingStateMoves;
    public static volatile SingularAttribute<CordpCustomerSelling, CorddCsellingType> corddCsellingType;
    public static volatile SingularAttribute<CordpCustomerSelling, CordpCustomerOrder> cordpCustomerOrder;
    public static volatile ListAttribute<CordpCustomerSelling, CordpCustomerSellingRole> cordpCustomerSellingRoles;
    public static volatile ListAttribute<CordpCustomerSelling, CordrCsellingIncident> cordrCsellingIncidents;
    public static volatile ListAttribute<CordpCustomerSelling, CordrCsellingRelaIn> cordrCsellingRelaIns1;
    public static volatile ListAttribute<CordpCustomerSelling, CordrCsellingRelaIn> cordrCsellingRelaIns2;
    public static volatile ListAttribute<CordpCustomerSelling, CordrCsellingRelaOut> cordrCsellingRelaOuts;
    public static volatile ListAttribute<CordpCustomerSelling, CordrCsellingVersionRela> cordrCsellingVersionRelas1;
    public static volatile ListAttribute<CordpCustomerSelling, CordrCsellingVersionRela> cordrCsellingVersionRelas2;
    public static volatile SingularAttribute<CordpCustomerSelling, CuinpCustomerQuote> cuinpCustomerQuote;
}
