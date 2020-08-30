package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.503+0200")
@StaticMetamodel(CordaLegacyOcsMessage.class)
public class CordaLegacyOcsMessage_ {
    public static volatile SingularAttribute<CordaLegacyOcsMessage, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordaLegacyOcsMessage, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordaLegacyOcsMessage, BigDecimal> roenIdLegaOcsMessa;
    public static volatile SingularAttribute<CordaLegacyOcsMessage, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordaLegacyOcsMessage, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordaLegacyOcsMessage, CevcpOplanTask> cevcpOplanTask;
    public static volatile ListAttribute<CordaLegacyOcsMessage, CordpLocsCharValue> cordpLocsCharValues;
}
