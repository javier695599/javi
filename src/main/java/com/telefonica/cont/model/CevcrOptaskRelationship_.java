package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.347+0200")
@StaticMetamodel(CevcrOptaskRelationship.class)
public class CevcrOptaskRelationship_ {
    public static volatile SingularAttribute<CevcrOptaskRelationship, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOptaskRelationship, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOptaskRelationship, BigDecimal> optrIdOptaskRelationship;
    public static volatile SingularAttribute<CevcrOptaskRelationship, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOptaskRelationship, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOptaskRelationship, CevcpOplanTask> cevcpOplanTask1;
    public static volatile SingularAttribute<CevcrOptaskRelationship, CevcpOplanTask> cevcpOplanTask2;
}
