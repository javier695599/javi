package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.476+0200")
@StaticMetamodel(CuindCqitemRelatWorkType.class)
public class CuindCqitemRelatWorkType_ {
    public static volatile SingularAttribute<CuindCqitemRelatWorkType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuindCqitemRelatWorkType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CuindCqitemRelatWorkType, BigDecimal> cqrtIdCqitemRelatWorkType;
    public static volatile SingularAttribute<CuindCqitemRelatWorkType, String> cqrtNaCqitemRelatWorkType;
    public static volatile SingularAttribute<CuindCqitemRelatWorkType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CuindCqitemRelatWorkType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CuindCqitemRelatWorkType, CuinrCqitemRelatedWork> cuinrCqitemRelatedWorks;
}
