package Controllers;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addRole")
    public ResponseEntity<Void> addRoleToUser(@RequestParam String username, @RequestParam String role) {
        userService.addRoleToUser(username, role);
        return ResponseEntity.ok().build();
    }

    // Other user-related endpoints
}
