package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.237+0200")
@StaticMetamodel(CevcpOplanElement.class)
public class CevcpOplanElement_ {
    public static volatile SingularAttribute<CevcpOplanElement, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcpOplanElement, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcpOplanElement, BigDecimal> opelIdOplanElement;
    public static volatile SingularAttribute<CevcpOplanElement, String> opelNaOplanElement;
    public static volatile SingularAttribute<CevcpOplanElement, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcpOplanElement, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcpOplanElement, CevcdOpelementType> cevcdOpelementType;
    public static volatile SingularAttribute<CevcpOplanElement, CevcpOplanMileston> cevcpOplanMileston;
    public static volatile SingularAttribute<CevcpOplanElement, CevcpOplanTask> cevcpOplanTask;
    public static volatile SingularAttribute<CevcpOplanElement, CevcpOrchestrationPlan> cevcpOrchestrationPlan;
    public static volatile ListAttribute<CevcpOplanElement, CevcrOpelementAfterFinish> cevcrOpelementAfterFinishs1;
    public static volatile ListAttribute<CevcpOplanElement, CevcrOpelementAfterFinish> cevcrOpelementAfterFinishs2;
    public static volatile ListAttribute<CevcpOplanElement, CevcrOpelementCuorItem> cevcrOpelementCuorItems;
}
