public class Client {
    public static void main(String[] args) {
        Book book = new BookProxy(128.31);
        book.display();//第一次需要调用calculate计算
        System.out.println("------------------------------------------------");
        book.display();//第二次不需要再次计算
    }
}
