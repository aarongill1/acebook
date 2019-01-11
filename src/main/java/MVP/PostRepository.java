package MVP;

import MVP.Post;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
//
//        List<Post> getFirstName(String firstName);
//        List<Post> getLastName(String lastName);
//        Post getId(int id);
    }
