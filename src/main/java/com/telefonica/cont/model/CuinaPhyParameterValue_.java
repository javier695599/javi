package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:54.376+0200")
@StaticMetamodel(CuinaPhyParameterValue.class)
public class CuinaPhyParameterValue_ {
	public static volatile SingularAttribute<CuinaPhyParameterValue, String> phpvDsParameterValue;
	public static volatile SingularAttribute<CuinaPhyParameterValue, BigDecimal> phpvIdCreatorParty;
	public static volatile SingularAttribute<CuinaPhyParameterValue, Long> phpvIdPhyParameterValue;
	public static volatile SingularAttribute<CuinaPhyParameterValue, BigDecimal> phpvIdUpdaterParty;
	public static volatile SingularAttribute<CuinaPhyParameterValue, String> phpvNaParameterValue;
	public static volatile SingularAttribute<CuinaPhyParameterValue, Timestamp> phpvTiCreation;
	public static volatile SingularAttribute<CuinaPhyParameterValue, Timestamp> phpvTiUpdate;
}
