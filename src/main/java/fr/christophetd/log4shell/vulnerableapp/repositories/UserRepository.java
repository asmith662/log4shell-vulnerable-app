package fr.christophetd.log4shell.vulnerableapp.repositories;

import org.springframework.data.repository.CrudRepository;
import fr.christophetd.log4shell.vulnerableapp.entities.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}