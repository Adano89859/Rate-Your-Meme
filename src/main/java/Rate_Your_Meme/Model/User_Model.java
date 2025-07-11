package Rate_Your_Meme.Model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name="User")
public class User_Model {




    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID_User;
    private String username;
    private String password;
    private String mail;
    private String Name;
    private int Age;

    public void setID_User(long ID_User) {
        this.ID_User = ID_User;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }


    public long getID_User() {
        return ID_User;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }


    //metodos
    public User_Model(long ID_User, String username, String password, String mail, String name, int age) {
        this.ID_User = ID_User;
        this.username = username;
        this.password = password;
        this.mail = mail;
        Name = name;
        Age = age;
    }
    public User_Model(){

    }


}


