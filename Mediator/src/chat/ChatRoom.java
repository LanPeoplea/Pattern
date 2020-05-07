package chat;

public class ChatRoom {
    public static void main(String[] args) {
        Medium md=new ConcreteMedium();//房产中介
        User user1,user2;
        user1=new UserA("Bob");
        user2=new UserB("Jennifer");
        md.register(user1); //客户注册
        md.register(user2);
    }
}
