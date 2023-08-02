package sb.web.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sb.web.demo.bean.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
