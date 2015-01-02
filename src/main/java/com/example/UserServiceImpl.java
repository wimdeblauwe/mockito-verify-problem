package com.example;

/**
 * Created by wdb on 02/01/15.
 */
public class UserServiceImpl implements UserService
{

	private Publisher m_publisher;

	public UserServiceImpl( Publisher publisher )
	{
		m_publisher = publisher;
	}

	@Override
	public void createUser( User user )
	{
		m_publisher.publishUserCreated( user );
	}
}
