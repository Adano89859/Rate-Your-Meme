package Rate_Your_Meme.Repository;

import Rate_Your_Meme.Model.User_Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repository  extends JpaRepository<User_Model, Long> {
}
