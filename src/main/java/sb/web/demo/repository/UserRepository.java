package sb.web.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sb.web.demo.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
