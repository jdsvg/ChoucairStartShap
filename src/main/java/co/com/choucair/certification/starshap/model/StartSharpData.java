package co.com.choucair.certification.starshap.model;

public class StartSharpData {
    private String  username;
    private String  password;

    private String name_unit;
    private String parent_unit;








    // Login Information
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // Busnisses Information
    public String getName_unit() {
        return name_unit;
    }

    public void setName_unit(String name_unit) {
        this.name_unit = name_unit;
    }

    public String getParent_unit() {
        return parent_unit;
    }

    public void setParent_unit(String parent_unit) {
        this.parent_unit = parent_unit;
    }
}
