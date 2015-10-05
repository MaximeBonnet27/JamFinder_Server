package jamfinder.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by maxime on 04/10/15.
 */
@Configuration
public class MongoConfig {

    public @Bean
    MongoTemplate mongoTemplate() throws Exception{
        MongoTemplate template = new MongoTemplate(new MongoClient("127.0.0.1"), "JamFinderDB");
        return template;
    }

}
