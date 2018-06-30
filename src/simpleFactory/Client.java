package simpleFactory;

public class Client {

    public static void main(String []args){
        //玩家到达某一分数，出现A类型飞机
        Plane A = Factory.producePlane("red");
        A.fly();
        //玩家到达某一分数，出现B类型飞机
        Plane B = Factory.producePlane("green");
        B.fly();
    }
}
