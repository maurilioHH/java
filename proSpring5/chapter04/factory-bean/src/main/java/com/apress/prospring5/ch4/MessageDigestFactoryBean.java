package com.apress.prospring5.ch4;

import java.security.MessageDigest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageDigestFactoryBean implements FactoryBean<MessageDigest>, InitializingBean
{
	private String algorithmName = "MD5";
	private MessageDigest messageDigest = null;

	public MessageDigest getObject() throws Exception
	{
		System.out.println("MessageDigestFactoryBean::getObject()");
		return messageDigest;
	}

	public Class<MessageDigest> getObjectType()
	{
		System.out.println("MessageDigestFactoryBean::getObjectType()");
		return MessageDigest.class;
	}

	public boolean isSingleton()
	{
		return true;
	}

	public void afterPropertiesSet() throws Exception
	{
		System.out.println("MessageDigestFactoryBean::afterPropertiesSet()");
		System.out.println("getInstance(...)");
		messageDigest = MessageDigest.getInstance(algorithmName);
	}

	public void setAlgorithmName(String algorithmName)
	{
		System.out.println("setAlgorithmName::" + algorithmName);
		this.algorithmName = algorithmName;
	}
}
