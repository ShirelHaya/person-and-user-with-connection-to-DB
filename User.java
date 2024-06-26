package entities;

public class User {
    private String username;
    private Integer password;

    public User(String username, Integer password) {
        this.username = username;
        this.password = password;
    }
    public User() {
        this.username = "username";
        this.password = 1234;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
