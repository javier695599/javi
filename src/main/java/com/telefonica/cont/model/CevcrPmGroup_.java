package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.347+0200")
@StaticMetamodel(CevcrPmGroup.class)
public class CevcrPmGroup_ {
    public static volatile SingularAttribute<CevcrPmGroup, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrPmGroup, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrPmGroup, Date> ghasDaEndValidity;
    public static volatile SingularAttribute<CevcrPmGroup, Date> ghasDaStartValidity;
    public static volatile SingularAttribute<CevcrPmGroup, Long> ghasIdPmGroup;
    public static volatile SingularAttribute<CevcrPmGroup, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrPmGroup, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrPmGroup, CevcpProcessMarkGroup> cevcpProcessMarkGroup;
    public static volatile ListAttribute<CevcrPmGroup, CevcrPmGroupRelship> cevcrPmGroupRelships1;
    public static volatile ListAttribute<CevcrPmGroup, CevcrPmGroupRelship> cevcrPmGroupRelships2;
    public static volatile SingularAttribute<CevcrPmGroup, CevcrProcMarkValueUse> cevcrProcMarkValueUse;
}
