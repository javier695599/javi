package com.telefonica.cont.model;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:54.376+0200")
@StaticMetamodel(CuinaPortaReqHasStep.class)
public class CuinaPortaReqHasStep_ {
	public static volatile SingularAttribute<CuinaPortaReqHasStep, Timestamp> audiTiCreation;
	public static volatile SingularAttribute<CuinaPortaReqHasStep, String> prhsDsMessage;
	public static volatile SingularAttribute<CuinaPortaReqHasStep, Long> prhsIdJob;
	public static volatile SingularAttribute<CuinaPortaReqHasStep, Long> prhsIdPortaReqHasStep;
	public static volatile SingularAttribute<CuinaPortaReqHasStep, Long> prhsIdStep;
	public static volatile SingularAttribute<CuinaPortaReqHasStep, String> prhsNaStepName;
	public static volatile SingularAttribute<CuinaPortaReqHasStep, String> prleNaPortaReqLogError;
	public static volatile SingularAttribute<CuinaPortaReqHasStep, String> prlrDsPortaReqLogError;
	public static volatile ListAttribute<CuinaPortaReqHasStep, CuinaPortaReqLogError> cuinaPortaReqLogErrors;
	public static volatile SingularAttribute<CuinaPortaReqHasStep, CuinpPortabilityRequest> cuinpPortabilityRequest;
}
