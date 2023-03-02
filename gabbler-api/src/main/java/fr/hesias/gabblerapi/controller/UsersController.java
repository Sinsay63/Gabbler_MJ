package fr.hesias.gabblerapi.controller;

import fr.hesias.gabblerapi.entity.Users;
import fr.hesias.gabblerapi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/users")
    public List<Users> getUsers() {
        return usersService.getUsers();
    }

    @RequestMapping("/user/{id}")
    public Users getUser(@PathVariable int id) {
        return usersService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        usersService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody Users user) {
        usersService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void addUser(@PathVariable int id, @RequestBody Users user) {
        usersService.updateUser(id, user);
    }
}
