package pack9;

import pack9.sub2.CTrapezoid;

import java.util.Scanner;

import pack9.sub1.CSphere;

public class class09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("set radius:");//輸入半徑
        double r = sc.nextDouble();
        System.out.print("set upper:");//輸入梯形數值
        String inp = sc.next();//以字串輸入
        String[] upper = inp.split(",");//使用逗號將字串個數值分開
        CSphere cs = new CSphere(r);
        int u = Integer.parseInt(upper[0]);//str to int
        int b = Integer.parseInt(upper[1]);
        int h = Integer.parseInt(upper[2]);
        CTrapezoid ct = new CTrapezoid(u, b, h);
    }

}
/* 
package pack9.sub1;
public class CSphere {
    double V;

    public CSphere(double r) {
        V = 4 / 3 * Math.PI * Math.pow(r, 3);
        System.out.println("體積為:" + V + '\n' + "半徑為:" + r);
    }
}
package pack9.sub2;

public class CTrapezoid {
    double A;

    public CTrapezoid(int u, int b, int h) {
        A = (u + b) * h / 2;
        System.out.println("上底為:" + u + "下底為:" + b + "高為:" + h + '\n' + "面積為:" + A);
    }
}

*/
