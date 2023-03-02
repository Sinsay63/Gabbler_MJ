package fr.hesias.gabblerapi.service;

import fr.hesias.gabblerapi.entity.Users;
import fr.hesias.gabblerapi.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public Users getUser(int id) {
        return usersRepository.findById(id).orElse(null);
    }

    public void deleteUser(int id) {
        usersRepository.deleteById(id);
    }

    public void addUser(Users user) {
        usersRepository.save(user);
    }

    public void updateUser(int id, Users user) {
        usersRepository.save(user);
    }
}
