package com.mtumminia.financetracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<model.User> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<model.User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    public model.User addUser(model.User user) {
        return userRepository.save(user);
    }
    public model.User updateUser(Long id, model.User userDetails) {
        Optional<model.User> user = userRepository.findById(id);
        if (user.isPresent()) {
            model.User existingUser = user.get();
            if (userDetails.getUsername() != null) {
                existingUser.setUsername(userDetails.getUsername());
            }
            if (userDetails.getEmail() != null) {
                existingUser.setEmail(userDetails.getEmail());
            }
            if (userDetails.getPassword() != null) {
                existingUser.setPassword(userDetails.getPassword());
            }
            return userRepository.save(existingUser);
        }
        return null;
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
