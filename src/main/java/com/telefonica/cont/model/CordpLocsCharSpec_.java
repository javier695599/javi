package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.651+0200")
@StaticMetamodel(CordpLocsCharSpec.class)
public class CordpLocsCharSpec_ {
    public static volatile SingularAttribute<CordpLocsCharSpec, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordpLocsCharSpec, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordpLocsCharSpec, Long> chspIdCharSpec;
    public static volatile SingularAttribute<CordpLocsCharSpec, String> locsNaCharSpec;
    public static volatile SingularAttribute<CordpLocsCharSpec, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordpLocsCharSpec, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordpLocsCharSpec, CorddCharactValueType> corddCharactValueType;
    public static volatile ListAttribute<CordpLocsCharSpec, CordpLocsCharValue> cordpLocsCharValues;
}
