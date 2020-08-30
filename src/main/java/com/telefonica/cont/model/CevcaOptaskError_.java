package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.175+0200")
@StaticMetamodel(CevcaOptaskError.class)
public class CevcaOptaskError_ {
    public static volatile SingularAttribute<CevcaOptaskError, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcaOptaskError, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcaOptaskError, BigDecimal> opteIdOptaskError;
    public static volatile SingularAttribute<CevcaOptaskError, String> opteObOptaskError;
    public static volatile SingularAttribute<CevcaOptaskError, Timestamp> opteTiOptaskError;
    public static volatile SingularAttribute<CevcaOptaskError, Long> pwrcIdProcWflwResultCode;
    public static volatile SingularAttribute<CevcaOptaskError, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcaOptaskError, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcaOptaskError, CevcpOplanTask> cevcpOplanTask;
}
