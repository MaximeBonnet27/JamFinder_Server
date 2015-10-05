package jamfinder;

import jamfinder.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by maxime on 03/10/15.
 */
public interface UserRepository extends MongoRepository<User, String> {

    public User findByMailAddress(String mailAddress);

}
