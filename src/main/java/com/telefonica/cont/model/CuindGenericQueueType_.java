package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-17T08:42:54.423+0200")
@StaticMetamodel(CuindGenericQueueType.class)
public class CuindGenericQueueType_ {
	public static volatile SingularAttribute<CuindGenericQueueType, Long> gectIdGenericQueueType;
	public static volatile SingularAttribute<CuindGenericQueueType, String> gectNaGenericQueueType;
	public static volatile ListAttribute<CuindGenericQueueType, CuinpGenericQueue> cuinpGenericQueues;
}
