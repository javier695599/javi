package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.253+0200")
@StaticMetamodel(CevcpOplanTask.class)
public class CevcpOplanTask_ {
    public static volatile SingularAttribute<CevcpOplanTask, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcpOplanTask, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcpOplanTask, BigDecimal> biroIdFunctionalPool;
    public static volatile SingularAttribute<CevcpOplanTask, BigDecimal> buinIdShippingOrder;
    public static volatile SingularAttribute<CevcpOplanTask, BigDecimal> opelIdOplanTask;
    public static volatile SingularAttribute<CevcpOplanTask, Boolean> optaInUndo;
    public static volatile SingularAttribute<CevcpOplanTask, BigDecimal> paroIdFunctionalRole;
    public static volatile SingularAttribute<CevcpOplanTask, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcpOplanTask, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcpOplanTask, CevcaOptaskError> cevcaOptaskErrors;
    public static volatile ListAttribute<CevcpOplanTask, CevcaOptaskStatusMove> cevcaOptaskStatusMoves;
    public static volatile SingularAttribute<CevcpOplanTask, CevcpOplanElement> cevcpOplanElement;
    public static volatile ListAttribute<CevcpOplanTask, CevcrOptaskIncident> cevcrOptaskIncidents;
    public static volatile ListAttribute<CevcpOplanTask, CevcrOptaskItemSpec> cevcrOptaskItemSpecs;
    public static volatile ListAttribute<CevcpOplanTask, CevcrOptaskRelationship> cevcrOptaskRelationships1;
    public static volatile ListAttribute<CevcpOplanTask, CevcrOptaskRelationship> cevcrOptaskRelationships2;
    public static volatile ListAttribute<CevcpOplanTask, CevcrOptaskSchedule> cevcrOptaskSchedules;
    public static volatile ListAttribute<CevcpOplanTask, CordaLegacyOcsMessage> cordaLegacyOcsMessages;
}
