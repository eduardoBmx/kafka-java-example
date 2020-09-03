package response;

import java.io.Serializable;

public class CustomerResponse implements Serializable {
    public CustomerResponse() {
    }

    public CustomerResponse(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    String id;
    String name;
    String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
