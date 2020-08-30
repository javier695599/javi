package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.378+0200")
@StaticMetamodel(CevcrPmToProdSpecChar.class)
public class CevcrPmToProdSpecChar_ {
    public static volatile SingularAttribute<CevcrPmToProdSpecChar, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcrPmToProdSpecChar, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcrPmToProdSpecChar, Long> pwchIdProdSpecChar;
    public static volatile SingularAttribute<CevcrPmToProdSpecChar, Long> tpscIdPmToProdSpecChar;
    public static volatile SingularAttribute<CevcrPmToProdSpecChar, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcrPmToProdSpecChar, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CevcrPmToProdSpecChar, CevcrProcMarkValueUse> cevcrProcMarkValueUse;
}
