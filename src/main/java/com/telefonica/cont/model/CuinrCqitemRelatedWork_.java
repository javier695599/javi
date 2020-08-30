package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.539+0200")
@StaticMetamodel(CuinrCqitemRelatedWork.class)
public class CuinrCqitemRelatedWork_ {
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, Timestamp> cqrwDaEndValidity;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, Timestamp> cqrwDaStartValidity;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, BigDecimal> cqrwIdCqitemRelatedWork;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, BigDecimal> workIdWork;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, CuindCqitemRelatWorkType> cuindCqitemRelatWorkType;
    public static volatile SingularAttribute<CuinrCqitemRelatedWork, CuinpCustomerQuoteItem> cuinpCustomerQuoteItem;
}
