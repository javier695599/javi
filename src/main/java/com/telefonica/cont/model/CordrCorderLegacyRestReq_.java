package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.667+0200")
@StaticMetamodel(CordrCorderLegacyRestReq.class)
public class CordrCorderLegacyRestReq_ {
    public static volatile SingularAttribute<CordrCorderLegacyRestReq, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCorderLegacyRestReq, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCorderLegacyRestReq, BigDecimal> buinIdCustomerOrder;
    public static volatile SingularAttribute<CordrCorderLegacyRestReq, String> lrrqCoLegacyRestricRequest;
    public static volatile SingularAttribute<CordrCorderLegacyRestReq, BigDecimal> lrrqIdLegacyRestricRequest;
    public static volatile SingularAttribute<CordrCorderLegacyRestReq, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCorderLegacyRestReq, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCorderLegacyRestReq, CordpCustomerOrder> cordpCustomerOrder;
}
