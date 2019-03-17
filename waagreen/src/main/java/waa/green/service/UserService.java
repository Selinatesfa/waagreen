package waa.green.service;

import waa.green.model.User;

public interface UserService {
	 public User findUserByEmail(String email);
	 public User saveUser(User user);
}
