package apiautomation;

import lombok.Data;

@Data
public class UserResponse {
    private UserData data;
    private Support support;

    // Getters and setters
    public UserData getData() { return data; }
    public void setData(UserData data) { this.data = data; }

    public Support getSupport() { return support; }
    public void setSupport(Support support) { this.support = support; }
}
