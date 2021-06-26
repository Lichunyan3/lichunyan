package ordersystem.domain;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Admin {
    private String aID;
    private String name;
    private String apwd;

    public Admin() {
    }

    public Admin(String aID, String name, String apwd) {
        this.aID = aID;
        this.name = name;
        this.apwd = apwd;
    }

    public String getaID() {
        return aID;
    }

    public void setaID(String aID) {
        this.aID = aID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aID='" + aID + '\'' +
                ", account='" + name + '\'' +
                ", apwd='" + apwd + '\'' +
                '}';
    }

}
