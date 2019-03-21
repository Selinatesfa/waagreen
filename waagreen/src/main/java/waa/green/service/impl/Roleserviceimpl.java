package waa.green.service.impl;

import java.util.List;

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
		@Override
		public List<Role> findrole() {
			// TODO Auto-generated method stub
			return roleRepository.findAll();
		}
		

}
