package codewithChen;

import java.awt.*;

public class primitiveTypesVsReferenceTypes05 {
    public static void main(String[] args) {
        //primitiveTypes
        // 赋值时拷贝的是"值"本身，两个变量独立
        byte a = 10;
        byte b = a;              // 把 a 的值 10 拷贝给 b
        System.out.println("赋值后：a=" + a + ", b=" + b);   // a=10, b=10

        a = 20;                  // 只改 a
        System.out.println("改 a 后：a=" + a + ", b=" + b);  // a=20, b=10  ← b 没变！
        //referenceTypes  有点像指针，从一个入口修改数值，另一个入口查看数值会改变
        // 赋值 = 拷贝地址，两个变量指向同一个对象
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);

    }
}
