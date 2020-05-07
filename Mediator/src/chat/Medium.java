package chat;

public interface Medium {
    void register(User user); //客户注册
    void relay(String from,String ad); //转发
}
