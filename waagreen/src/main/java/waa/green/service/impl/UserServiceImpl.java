package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import waa.green.model.Role;
import waa.green.model.User;
import waa.green.repository.RoleRepository;
import waa.green.repository.UserRepository;
import waa.green.service.UserService;
import java.util.Arrays;
import java.util.HashSet;

@Service("userService")
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
@Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
@Override
    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
       // user.setActive(1);
      //  Role r= new Role();
      //  r.setRole("ADMIN");
       // roleRepository.save(r);
      //  Role userRole = roleRepository.findByRole("ADMIN");
       // user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        return userRepository.save(user);
    }

	

}