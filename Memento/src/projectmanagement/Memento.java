package projectmanagement;

/**
 *备忘录
 */
public class Memento {
    private String version;
    public Memento(String version){
        this.version = version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getVersion() {
        return version;
    }
}
