package com.banco.nosso_banco_digital.repository;

import org.springframework.data.repository.CrudRepository;
import com.banco.nosso_banco_digital.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
