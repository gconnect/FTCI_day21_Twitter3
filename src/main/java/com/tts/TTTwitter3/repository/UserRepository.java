package com.tts.TTTwitter3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.TTTwitter3.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  public User findByUsername(String username);
}
