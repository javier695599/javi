package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.284+0200")
@StaticMetamodel(CevcrOpelementAfterFinish.class)
public class CevcrOpelementAfterFinish_ {
    public static volatile SingularAttribute<CevcrOpelementAfterFinish, BigDecimal> affiIdOpelementAfterFinish;
    public static volatile SingularAttribute<CevcrOpelementAfterFinish, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrOpelementAfterFinish, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrOpelementAfterFinish, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrOpelementAfterFinish, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrOpelementAfterFinish, CevcpOplanElement> cevcpOplanElement1;
    public static volatile SingularAttribute<CevcrOpelementAfterFinish, CevcpOplanElement> cevcpOplanElement2;
}
