package com.apress.prospring5.ch8;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-10-15T20:31:43.115+0200")
@StaticMetamodel(Album.class)
public class Album_ {
	public static volatile SingularAttribute<Album, Long> id;
	public static volatile SingularAttribute<Album, Integer> version;
	public static volatile SingularAttribute<Album, String> title;
	public static volatile SingularAttribute<Album, Date> releaseDate;
	public static volatile SingularAttribute<Album, Singer> singer;
}
