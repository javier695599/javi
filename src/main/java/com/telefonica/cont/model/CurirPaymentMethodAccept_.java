package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.570+0200")
@StaticMetamodel(CurirPaymentMethodAccept.class)
public class CurirPaymentMethodAccept_ {
    public static volatile SingularAttribute<CurirPaymentMethodAccept, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CurirPaymentMethodAccept, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CurirPaymentMethodAccept, Long> pmetIdPaymentMethodType;
    public static volatile SingularAttribute<CurirPaymentMethodAccept, Long> pmtaIdPaymentMethodAccept;
    public static volatile SingularAttribute<CurirPaymentMethodAccept, Long> rircIdRiskResponseCause;
    public static volatile SingularAttribute<CurirPaymentMethodAccept, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CurirPaymentMethodAccept, BigDecimal> userIdUpdaterParty;
}
