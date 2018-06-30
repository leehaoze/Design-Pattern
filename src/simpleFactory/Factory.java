package simpleFactory;

public class Factory {
    /**
     * 静态方法，只需要提供参数便可以返回对象
     * @param color 构造飞机的参数，这里使用颜色作为参数
     * @return 返回Plane类型的飞机对象（虽然返回的是接口类型，但其实是返回的实现子类）
     */
    public static Plane producePlane(String color){
        if(color.equals("red")){
            return new RedPlane();
        }
        else if(color.equals("green")){
            return new GreenPlane();
        }
        return null;
    }
}
