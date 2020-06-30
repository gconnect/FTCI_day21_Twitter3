package com.tts.TTTwitter3.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.TTTwitter3.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
  public Tag findByPhrase(String phrase);
}
