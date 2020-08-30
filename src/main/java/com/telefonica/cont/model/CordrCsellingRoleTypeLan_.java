package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.836+0200")
@StaticMetamodel(CordrCsellingRoleTypeLan.class)
public class CordrCsellingRoleTypeLan_ {
    public static volatile SingularAttribute<CordrCsellingRoleTypeLan, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingRoleTypeLan, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingRoleTypeLan, String> crlaDsCsellingRoleTypeLan;
    public static volatile SingularAttribute<CordrCsellingRoleTypeLan, String> crlaNaCsellingRoleTypeLan;
    public static volatile SingularAttribute<CordrCsellingRoleTypeLan, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingRoleTypeLan, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingRoleTypeLan, CorddCsellingRoleType> corddCsellingRoleType;
    public static volatile SingularAttribute<CordrCsellingRoleTypeLan, CordrCsellingRoleTypeLanPK> id;
}
