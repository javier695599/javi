package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.398+0200")
@StaticMetamodel(CordsCustomerSelling.class)
public class CordsCustomerSelling_ {
    public static volatile SingularAttribute<CordsCustomerSelling, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCustomerSelling, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCustomerSelling, Long> bintIdCsellingType;
    public static volatile SingularAttribute<CordsCustomerSelling, String> buinCoCustomerSelling;
    public static volatile SingularAttribute<CordsCustomerSelling, BigDecimal> buinIdCustomerSelling;
    public static volatile SingularAttribute<CordsCustomerSelling, Timestamp> buinTiCompleteInterac;
    public static volatile SingularAttribute<CordsCustomerSelling, Timestamp> buinTiStartInterac;
    public static volatile SingularAttribute<CordsCustomerSelling, String> lcorDsCustomerSellingLang;
    public static volatile SingularAttribute<CordsCustomerSelling, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCustomerSelling, BigDecimal> userIdUpdaterParty;
}
