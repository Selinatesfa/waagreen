package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.green.model.Role;
import waa.green.repository.RoleRepository;
import waa.green.service.RoleService;
@Service
public class Roleserviceimpl implements RoleService{
	@Autowired
	 public RoleRepository roleRepository;
		@Override
	public Role saverole(Role role) {
		
		return roleRepository.save(role);
	}

}
