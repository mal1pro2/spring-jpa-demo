package com.gm.jpa.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.jpa.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
	public Page<Comment> findByPostId(Long postId, Pageable pageable);

	public Optional<Comment> findByIdAndPostId(Long id, Long postId);
}