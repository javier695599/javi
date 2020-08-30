package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.537+0200")
@StaticMetamodel(CorddCsellingRoleClass.class)
public class CorddCsellingRoleClass_ {
    public static volatile SingularAttribute<CorddCsellingRoleClass, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCsellingRoleClass, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCsellingRoleClass, Date> crocDaEndValidity;
    public static volatile SingularAttribute<CorddCsellingRoleClass, Date> crocDaStartValidity;
    public static volatile SingularAttribute<CorddCsellingRoleClass, String> crocDsCsellingRoleClass;
    public static volatile SingularAttribute<CorddCsellingRoleClass, Long> crocIdCsellingRoleClass;
    public static volatile SingularAttribute<CorddCsellingRoleClass, String> crocNaCsellingRoleClass;
    public static volatile SingularAttribute<CorddCsellingRoleClass, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCsellingRoleClass, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddCsellingRoleClass, CordpCustomerSellingRole> cordpCustomerSellingRoles;
}
