package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.476+0200")
@StaticMetamodel(CuindCqitemSourceType.class)
public class CuindCqitemSourceType_ {
    public static volatile SingularAttribute<CuindCqitemSourceType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuindCqitemSourceType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuindCqitemSourceType, Long> cqisIdCqitemSourceType;
    public static volatile SingularAttribute<CuindCqitemSourceType, String> cqisNaCqitemSourceType;
    public static volatile SingularAttribute<CuindCqitemSourceType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuindCqitemSourceType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CuindCqitemSourceType, CuinpCustomerQuoteItem> cuinpCustomerQuoteItems;
}
