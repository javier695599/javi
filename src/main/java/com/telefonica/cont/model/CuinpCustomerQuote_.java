package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.508+0200")
@StaticMetamodel(CuinpCustomerQuote.class)
public class CuinpCustomerQuote_ {
    public static volatile SingularAttribute<CuinpCustomerQuote, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuinpCustomerQuote, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuinpCustomerQuote, Long> bispIdBusinessInteSpecCat;
    public static volatile SingularAttribute<CuinpCustomerQuote, BigDecimal> buinIdCustomerQuote;
    public static volatile SingularAttribute<CuinpCustomerQuote, Long> cimtIdCustInquirySubtype;
    public static volatile SingularAttribute<CuinpCustomerQuote, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuinpCustomerQuote, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CuinpCustomerQuote, CordpCustomerSelling> cordpCustomerSelling;
    public static volatile ListAttribute<CuinpCustomerQuote, CuinpCustomerQuoteItem> cuinpCustomerQuoteItems;
}
