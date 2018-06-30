package Factory;

/**
 * 具体的飞机类，构造函数可以具有一系列的参数
 */
public class RedPlane implements Plane {
    public RedPlane() {
        System.out.println("I am RedPlane");
    }

    @Override
    public void fly() {
        System.out.println("Red Plane fly");
    }
}
