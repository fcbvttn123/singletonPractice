public class singleObject {

    private static singleObject obj = new singleObject();

    private singleObject() {};

    public static singleObject getInstance() {
        return obj;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }
}