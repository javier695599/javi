package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.898+0200")
@StaticMetamodel(CordrCsellingVersionType.class)
public class CordrCsellingVersionType_ {
    public static volatile SingularAttribute<CordrCsellingVersionType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingVersionType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingVersionType, Long> cstvIdCsellingVersionType;
    public static volatile SingularAttribute<CordrCsellingVersionType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingVersionType, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingVersionType, CorddCsellingType> corddCsellingType;
    public static volatile SingularAttribute<CordrCsellingVersionType, CorddCsellingVersReason> corddCsellingVersReason;
    public static volatile ListAttribute<CordrCsellingVersionType, CordrCsellingVersionRela> cordrCsellingVersionRelas;
}
