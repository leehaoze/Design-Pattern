package simpleFactory;

/**
 * 具体的飞机类，构造函数可以具有一系列的参数
 */
public class GreenPlane implements Plane {
    public GreenPlane() {
        System.out.println("I am GreenPlane");
    }

    @Override
    public void fly() {
        System.out.println("Green Plane fly");
    }
}
