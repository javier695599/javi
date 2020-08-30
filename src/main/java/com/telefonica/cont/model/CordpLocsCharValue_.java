package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.651+0200")
@StaticMetamodel(CordpLocsCharValue.class)
public class CordpLocsCharValue_ {
    public static volatile SingularAttribute<CordpLocsCharValue, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordpLocsCharValue, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordpLocsCharValue, BigDecimal> chvaIdCharacValue;
    public static volatile SingularAttribute<CordpLocsCharValue, String> chvaNaCharacValue;
    public static volatile SingularAttribute<CordpLocsCharValue, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordpLocsCharValue, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordpLocsCharValue, CordaLegacyOcsMessage> cordaLegacyOcsMessage;
    public static volatile SingularAttribute<CordpLocsCharValue, CordpLocsCharSpec> cordpLocsCharSpec;
}
