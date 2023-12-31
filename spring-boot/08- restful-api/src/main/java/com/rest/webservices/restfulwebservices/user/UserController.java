//package com.rest.webservices.restfulwebservices.user;
//
//
//import jakarta.validation.Valid;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//import java.util.List;
//
//@RestController
//public class UserController {
//
//    private UserDaoService service;
//
//    public UserController(UserDaoService service) {
//        this.service = service;
//    }
//
//    @GetMapping("/users")
//    public List<User> retrieveAllUsers() {
//        return service.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    public User retrieveUserById(@PathVariable int id) {
//        User user = service.findOne(id);
//
//        if (user == null) {
//            throw new UserNotFoundException("id: " + id);
//        }
//
//        return null;
//    }
//
//    @PostMapping("/users")
//    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
//        User createdUser = service.save(user);
//        URI location = ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(createdUser.getId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }
//
//    @DeleteMapping("/users/{id}")
//    public void deleteUser(@PathVariable int id) {
//       service.delete(id);
//    }
//}
