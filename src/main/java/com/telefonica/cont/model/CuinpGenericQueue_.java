package com.telefonica.cont.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:55.017+0200")
@StaticMetamodel(CuinpGenericQueue.class)
public class CuinpGenericQueue_ {
	public static volatile SingularAttribute<CuinpGenericQueue, String> gecuCoClass;
	public static volatile SingularAttribute<CuinpGenericQueue, String> gecuDsMessage;
	public static volatile SingularAttribute<CuinpGenericQueue, BigDecimal> gecuIdClass;
	public static volatile SingularAttribute<CuinpGenericQueue, BigDecimal> gecuIdCreatorParty;
	public static volatile SingularAttribute<CuinpGenericQueue, Long> gecuIdGenericQueue;
	public static volatile SingularAttribute<CuinpGenericQueue, BigDecimal> gecuIdUpdaterParty;
	public static volatile SingularAttribute<CuinpGenericQueue, Timestamp> gecuTiCreation;
	public static volatile SingularAttribute<CuinpGenericQueue, Timestamp> gecuTiUpdate;
	public static volatile SingularAttribute<CuinpGenericQueue, CuindGenericQueueType> cuindGenericQueueType;
}
