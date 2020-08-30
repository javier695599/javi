package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.190+0200")
@StaticMetamodel(CevcdOpelementType.class)
public class CevcdOpelementType_ {
    public static volatile SingularAttribute<CevcdOpelementType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcdOpelementType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcdOpelementType, Date> opetDaEndValidity;
    public static volatile SingularAttribute<CevcdOpelementType, Date> opetDaStartValidity;
    public static volatile SingularAttribute<CevcdOpelementType, Long> opetIdOpelementType;
    public static volatile SingularAttribute<CevcdOpelementType, String> opetNaOpelementType;
    public static volatile SingularAttribute<CevcdOpelementType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcdOpelementType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcdOpelementType, CevcpOplanElement> cevcpOplanElements;
}
