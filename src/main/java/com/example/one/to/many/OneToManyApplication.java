package com.example.one.to.many;

import com.example.one.to.many.entity.Comment;
import com.example.one.to.many.entity.Post;
import com.example.one.to.many.entity.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}
@Autowired
private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {

		Post post =new Post("one to one mayny","one to may");

		Comment comment1 =new Comment("veryuseful");
		Comment comment2 =new Comment("veryuseful");
		Comment comment3 =new Comment("veryuseful");
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		this.postRepository.save(post);
	}
}
