package com.example;

import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

public class UserServiceImplTest
{

	@Test
	public void test()
	{
		Publisher publisher = mock( Publisher.class );
		UserService userService = new UserServiceImpl( publisher );

		User user = new User();

		userService.createUser( user );

		// This will run fine
		//verify( publisher ).publishUserCreated( user );

		// This will give the verify problem
		verify( publisher, timeout(500) ).publishUserCreated( user );
	}
}