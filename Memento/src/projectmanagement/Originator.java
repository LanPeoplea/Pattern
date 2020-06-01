package projectmanagement;

/**
 *发起人
 */
public class Originator {
    private String version;
    public void setVersion(String version) {
        this.version = version;
    }
    public String getVersion() {
        return version;
    }
    public Memento createMemento(){
        return new Memento(version);
    }
    public void restoreMemento(Memento m){
        this.setVersion(m.getVersion());
    }
}
