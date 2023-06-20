package com.openclassrooms.datalayer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.datalayer.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer>{
	public Iterable<Comment> getByContentContains(String word);
}
