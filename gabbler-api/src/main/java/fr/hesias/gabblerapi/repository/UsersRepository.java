package fr.hesias.gabblerapi.repository;

import fr.hesias.gabblerapi.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    // C'est la où on va déclarer nos fonctions pour nos requêtes custom

}
