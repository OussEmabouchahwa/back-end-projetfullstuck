package Service;

import Repositories.UserRepository;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void addRoleToUser(String username, String role) {
        Optional<User> user = userRepository.findByUsername(username);
        user.ifPresent(u -> {
            u.getRoles().add(role);
            userRepository.save(u);
        });
    }

    public boolean isAdmin(User user) {
        return user.getRoles().contains("ROLE_ADMIN");
    }
}
