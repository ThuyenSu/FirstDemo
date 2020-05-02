
package chapter2.task2;

import java.text.DecimalFormat;
import java.util.Random;


/*Tự động sinh chiều dài, chiều rộng của hình chữ nhật. tính và in ra chu vi diện tích của
hình. Yêu cầu kết quả in ra có định dạng.*/

public class HinhChuNhat {
    public static void main(String[] args) {
        float width, height, chuVi, dienTich;
        Random rd = new Random();
        width = rd.nextFloat()+1;
        height = rd.nextFloat()+1;
        chuVi = (width+height)*2;
        dienTich = width*height;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.printf("%-10s%-15s%-10s%-10s\n","Chiều dài","Chiều rộng","Chu Vi","Diện tích");
        System.out.printf("%5s%10s%15s%10s\n",df.format(height),
                df.format(width),df.format(chuVi),df.format(dienTich));
   
    }
}
