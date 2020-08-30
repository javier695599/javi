package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.362+0200")
@StaticMetamodel(CevcrPmGroupRelship.class)
public class CevcrPmGroupRelship_ {
    public static volatile SingularAttribute<CevcrPmGroupRelship, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrPmGroupRelship, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrPmGroupRelship, Date> pgreDaEndValidity;
    public static volatile SingularAttribute<CevcrPmGroupRelship, Date> pgreDaStartValidity;
    public static volatile SingularAttribute<CevcrPmGroupRelship, Long> pgreIdPmGroupRelship;
    public static volatile SingularAttribute<CevcrPmGroupRelship, String> pgreNaPurposePmGroup;
    public static volatile SingularAttribute<CevcrPmGroupRelship, Long> pgreNuSequentialOrder;
    public static volatile SingularAttribute<CevcrPmGroupRelship, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrPmGroupRelship, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrPmGroupRelship, CevcrPmGroup> cevcrPmGroup1;
    public static volatile SingularAttribute<CevcrPmGroupRelship, CevcrPmGroup> cevcrPmGroup2;
}
