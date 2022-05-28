package facade;

/**
 * @author xiu
 * @create 2022-04-28 9:10
 */
public class client {
    facade facade;

    public static void main(String[] args) {
        client client = new client();
        client.facade.Attend();
        client.facade.finish();
        System.out.println("abcd");
    }

    public client() {
        this.facade =new facade();
    }
}
