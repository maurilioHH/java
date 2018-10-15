package com.apress.prospring5.ch8;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-10-15T20:31:43.160+0200")
@StaticMetamodel(Instrument.class)
public class Instrument_ {
	public static volatile SingularAttribute<Instrument, String> instrumentId;
	public static volatile SetAttribute<Instrument, Singer> singers;
}
