package com.apress.prospring5.ch8;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-10-15T20:31:43.163+0200")
@StaticMetamodel(Singer.class)
public class Singer_ {
	public static volatile SingularAttribute<Singer, Long> id;
	public static volatile SingularAttribute<Singer, Integer> version;
	public static volatile SingularAttribute<Singer, String> firstName;
	public static volatile SingularAttribute<Singer, String> lastName;
	public static volatile SingularAttribute<Singer, Date> birthDate;
	public static volatile SetAttribute<Singer, Album> albums;
	public static volatile SetAttribute<Singer, Instrument> instruments;
}
