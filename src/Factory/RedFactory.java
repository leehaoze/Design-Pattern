package Factory;

/**
 * 生产红色飞机的工厂
 */
public class RedFactory implements Factory{
    @Override
    public Plane producePlane() {
        return new RedPlane();
    }
}
