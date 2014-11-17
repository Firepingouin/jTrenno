package com.cpe.jee.beans;

import java.util.List;

public interface UserManager {
	public List<User> getUsers() throws Exception;
	public String addUser() throws Exception;
	public User findUser(String username, String password) throws Exception;
	public User getNewUser();
}
