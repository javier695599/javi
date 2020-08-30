package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.445+0200")
@StaticMetamodel(CuinaPortaReqLogError.class)
public class CuinaPortaReqLogError_ {
    public static volatile SingularAttribute<CuinaPortaReqLogError, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuinaPortaReqLogError, Long> prleIdPortaReqLogError;
    public static volatile SingularAttribute<CuinaPortaReqLogError, String> prleNaPortaReqLogError;
    public static volatile SingularAttribute<CuinaPortaReqLogError, String> prlrDsPortaReqLogError;
    public static volatile SingularAttribute<CuinaPortaReqLogError, CuinaPortaReqHasStep> cuinaPortaReqHasStep;
}
