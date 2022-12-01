package pack9;

import pack9.sub2.CTrapezoid;

import java.util.Scanner;

import pack9.sub1.CSphere;

public class class09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("set radius:");
        double r = sc.nextDouble();
        System.out.print("set upper:");
        String inp = sc.next();
        String[] upper = inp.split(",");
        CSphere cs = new CSphere(r);
        int u = Integer.parseInt(upper[0]);
        int b = Integer.parseInt(upper[1]);
        int h = Integer.parseInt(upper[2]);
        CTrapezoid ct = new CTrapezoid(u, b, h);
    }

}