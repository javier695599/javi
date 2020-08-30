package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.503+0200")
@StaticMetamodel(CorddCharactValueType.class)
public class CorddCharactValueType_ {
    public static volatile SingularAttribute<CorddCharactValueType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCharactValueType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCharactValueType, Date> cvtyDaEndValidity;
    public static volatile SingularAttribute<CorddCharactValueType, Date> cvtyDaStartValidity;
    public static volatile SingularAttribute<CorddCharactValueType, String> cvtyDsCharactValueType;
    public static volatile SingularAttribute<CorddCharactValueType, Long> cvtyIdCharactValueType;
    public static volatile SingularAttribute<CorddCharactValueType, String> cvtyNaCharactValueType;
    public static volatile SingularAttribute<CorddCharactValueType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCharactValueType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddCharactValueType, CordpLocsCharSpec> cordpLocsCharSpecs;
}
