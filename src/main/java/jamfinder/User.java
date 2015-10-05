package jamfinder;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

/**
 * Created by maxime on 03/10/15.
 */

@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String name;

    private String password;

    private String mailAddress;

    private String[] instruments;

    public User() { }

    public User(String name, String password, String mailAddress, String[] instruments){
        this.name = name;
        this.password = password;
        this.mailAddress = mailAddress;
        this.instruments = instruments;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", instruments=" + Arrays.toString(instruments) +
                '}';
    }
}
