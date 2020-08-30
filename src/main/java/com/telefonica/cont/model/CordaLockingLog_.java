package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.034+0200")
@StaticMetamodel(CordaLockingLog.class)
public class CordaLockingLog_ {	
   public static volatile SingularAttribute<CordaLockingLog, BigDecimal> buinIdCustomerOrder;
   public static volatile SingularAttribute<CordaLockingLog, Date> llogTiStartDate;
   public static volatile SingularAttribute<CordaLockingLog, BigDecimal> paroIdFunctionalRole;
   public static volatile SingularAttribute<CordaLockingLog, CordpCustomerOrder> cordpCustomerOrder;   
}
