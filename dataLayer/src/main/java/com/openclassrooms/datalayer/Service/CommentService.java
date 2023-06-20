package com.openclassrooms.datalayer.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.datalayer.Repository.CommentRepository;
import com.openclassrooms.datalayer.model.Comment;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	
	public Iterable<Comment> getComments(){
		return commentRepository.findAll();
	}
	
	public Optional<Comment> getCommentById(Integer id){
		return commentRepository.findById(id);
	}
	
	public Iterable<Comment> getByContentContains(String word){
		return commentRepository.getByContentContains(word);
	}
	
	public Comment addComment(Comment comment) {
		return commentRepository.save(comment);
	}
	
	public void removeCommentById(Integer id) {
		commentRepository.deleteById(id);
	}
	
}
