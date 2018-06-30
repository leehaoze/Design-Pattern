package Factory;

//客户端
public class Client {
    public static void main(String []args){
        //玩家到达某一分数，出现A类型飞机
        Factory redFactory = new RedFactory();
        Plane A = redFactory.producePlane();
        A.fly();
        //玩家到达某一分数，出现B类型飞机
        Factory greenFactory = new GreenFactory();
        Plane B = greenFactory.producePlane();
        B.fly();
    }
}
