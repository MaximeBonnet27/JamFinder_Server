package jamfinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by maxime on 03/10/15.
 */

@SpringBootApplication
public class Application implements CommandLineRunner{

    @Autowired
    private UserRepository repository;

    public static void main(String ... args){
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        String[] instruments = {"Guitar"};

        User maxime = new User("Maxime", "1234", "max@gmail.com", instruments);
        User kevin = new User("Kevin", "123455678", "keke@gmail.com", instruments);

        repository.save(maxime);
        repository.save(kevin);

        System.out.println(repository.findByMailAddress("max@gmail.com"));

    }


}
