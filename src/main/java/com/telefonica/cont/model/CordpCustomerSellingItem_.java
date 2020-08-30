package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.635+0200")
@StaticMetamodel(CordpCustomerSellingItem.class)
public class CordpCustomerSellingItem_ {
    public static volatile SingularAttribute<CordpCustomerSellingItem, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordpCustomerSellingItem, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordpCustomerSellingItem, BigDecimal> biitIdCustomerSellingItem;
    public static volatile SingularAttribute<CordpCustomerSellingItem, Long> biitQuCustSellItem;
    public static volatile SingularAttribute<CordpCustomerSellingItem, Long> bisiIdBiSpecItem;
    public static volatile SingularAttribute<CordpCustomerSellingItem, Date> csimDaEndCsitem;
    public static volatile SingularAttribute<CordpCustomerSellingItem, Date> csimDaStartCsitem;
    public static volatile SingularAttribute<CordpCustomerSellingItem, BigDecimal> prodIdProduct;
    public static volatile SingularAttribute<CordpCustomerSellingItem, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordpCustomerSellingItem, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordpCustomerSellingItem, AgrepCustomerAgreementIt> agrepCustomerAgreementIt;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordaCsellingItemCharVal> cordaCsellingItemCharVals;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordaCsitemStateMove> cordaCsitemStateMoves;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordaCsitemSubstatMove> cordaCsitemSubstatMoves;
    public static volatile SingularAttribute<CordpCustomerSellingItem, CorddCsellingItemType> corddCsellingItemType;
    public static volatile SingularAttribute<CordpCustomerSellingItem, CorddExecutionMode> corddExecutionMode;
    public static volatile SingularAttribute<CordpCustomerSellingItem, CorddUnitMeasure> corddUnitMeasure;
    public static volatile SingularAttribute<CordpCustomerSellingItem, CordpCustomerOrderItem> cordpCustomerOrderItem;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordrCsellingItemBiAssoc> cordrCsellingItemBiAssocs;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordrCsellingItemIncident> cordrCsellingItemIncidents;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordrCsellingItemRelaIn> cordrCsellingItemRelaIns1;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordrCsellingItemRelaIn> cordrCsellingItemRelaIns2;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordrCsellingItemRelaOut> cordrCsellingItemRelaOuts;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordrCsellingItemSchedule> cordrCsellingItemSchedules;
    public static volatile ListAttribute<CordpCustomerSellingItem, CordrCsellingRoleAssoc> cordrCsellingRoleAssocs;
    public static volatile SingularAttribute<CordpCustomerSellingItem, CuinpCustomerQuoteItem> cuinpCustomerQuoteItem;
}
