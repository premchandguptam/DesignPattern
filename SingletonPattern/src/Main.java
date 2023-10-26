public class Main {
    public static void main(String[] args) {

        // Error: java: SingleObject() has private access in SingleObject
        //SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();

        object.showMessage();


    }
}