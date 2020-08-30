package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.541+0200")
@StaticMetamodel(CorddCsellingRoleType.class)
public class CorddCsellingRoleType_ {
    public static volatile SingularAttribute<CorddCsellingRoleType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCsellingRoleType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCsellingRoleType, String> crlaDsCsellingRoleTypeLan;
    public static volatile SingularAttribute<CorddCsellingRoleType, String> crlaNaCsellingRoleTypeLan;
    public static volatile SingularAttribute<CorddCsellingRoleType, Date> crotDaEndValidity;
    public static volatile SingularAttribute<CorddCsellingRoleType, Date> crotDaStartValidity;
    public static volatile SingularAttribute<CorddCsellingRoleType, Long> crotIdCsellingRoleType;
    public static volatile SingularAttribute<CorddCsellingRoleType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCsellingRoleType, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CorddCsellingRoleType, CorddCsellingType> corddCsellingType;
    public static volatile ListAttribute<CorddCsellingRoleType, CordpCustomerSellingRole> cordpCustomerSellingRoles;
    public static volatile ListAttribute<CorddCsellingRoleType, CordrCsellingRoleTypeLan> cordrCsellingRoleTypeLans;
}
