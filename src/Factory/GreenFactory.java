package Factory;

/**
 * 生产绿色飞机的工厂
 */
public class GreenFactory implements Factory {
    @Override
    public Plane producePlane() {
        return new GreenPlane();
    }
}
