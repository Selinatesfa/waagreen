package waa.green.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.green.model.Role;
import waa.green.model.User;
import waa.green.repository.RoleRepository;

public interface RoleService {
	
	
	 public Role saverole(Role user);
public List<Role> findrole();
}
