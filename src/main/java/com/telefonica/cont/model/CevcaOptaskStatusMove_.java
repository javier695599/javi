package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.175+0200")
@StaticMetamodel(CevcaOptaskStatusMove.class)
public class CevcaOptaskStatusMove_ {
    public static volatile SingularAttribute<CevcaOptaskStatusMove, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, BigDecimal> othsIdOptaskStatusMove;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, Timestamp> othsTiEndValidity;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, Timestamp> othsTiStartValidity;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, BigDecimal> paroIdFunctionalRole;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, CevcdOptaskStatus> cevcdOptaskStatus;
    public static volatile SingularAttribute<CevcaOptaskStatusMove, CevcpOplanTask> cevcpOplanTask;
}
