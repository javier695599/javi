package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.268+0200")
@StaticMetamodel(CevcpProcessMarkGroup.class)
public class CevcpProcessMarkGroup_ {
    public static volatile SingularAttribute<CevcpProcessMarkGroup, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcpProcessMarkGroup, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcpProcessMarkGroup, Date> pmgrDaEndValidity;
    public static volatile SingularAttribute<CevcpProcessMarkGroup, Date> pmgrDaStartValidity;
    public static volatile SingularAttribute<CevcpProcessMarkGroup, String> pmgrDsProcessMarkGroup;
    public static volatile SingularAttribute<CevcpProcessMarkGroup, Long> pmgrIdProcessMarkGroup;
    public static volatile SingularAttribute<CevcpProcessMarkGroup, String> pmgrNaProcessMarkGroup;
    public static volatile SingularAttribute<CevcpProcessMarkGroup, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcpProcessMarkGroup, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcpProcessMarkGroup, CevcrPmGroup> cevcrPmGroups;
}
