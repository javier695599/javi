package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.539+0200")
@StaticMetamodel(CuinrCquoteInvolvesPoterm.class)
public class CuinrCquoteInvolvesPoterm_ {
    public static volatile SingularAttribute<CuinrCquoteInvolvesPoterm, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuinrCquoteInvolvesPoterm, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuinrCquoteInvolvesPoterm, BigDecimal> cqpoIdCquoteInvolvesPoterm;
    public static volatile SingularAttribute<CuinrCquoteInvolvesPoterm, Long> poteIdProductOfferingTerm;
    public static volatile SingularAttribute<CuinrCquoteInvolvesPoterm, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuinrCquoteInvolvesPoterm, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CuinrCquoteInvolvesPoterm, CuinpCustomerQuoteItem> cuinpCustomerQuoteItem;
}
