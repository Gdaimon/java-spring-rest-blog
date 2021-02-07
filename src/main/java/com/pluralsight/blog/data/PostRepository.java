package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource ( rel = "contains-title", path = "containsTitle" )
public interface PostRepository extends JpaRepository < Post, Long > {

//	@Autowired
//	DatabaseLoader databaseLoader= new DatabaseLoader (  );
//
//	default List < Post > findByTitleContaining ( String title ) {
//		List < Post > postList = new ArrayList <> ( );
//		for ( Post post : databaseLoader.randomPosts ) {
//			if ( post.getTitle ( ).contains ( title ) ) {
//				postList.add ( post );
//			}
//		}
//		return postList;
//	}

}