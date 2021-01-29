package com.java.android25012021;

public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
//        comment code : ctrl + / or /* */
        /*
         1 : Kiểu dữ liệu
         Primitive type (Nguyên thủy)
            int(Số nguyên) ,
            float(số thực) , double (số thực ) ,
            char (Ký tự) , boolean(Luận lý) ...
            int a = 5;
            float b = 1.1111111f;
            double c = 2.22222222;
            char d = 's';
            boolean e = true;
            System.out.print(e);
         Non-Primitive type(Kiểu đối tượng)
         2 : Toán tử
        int a = 5;
        int b = 5;
        int ketqua = a++ - --b - a++ + b-- + a++ - a++ - --b;
        // 5 - --b - a++ + b-- + a++ - a++ - --b; a = 6 , b = 5
        // 5 - 4 - a++ + b-- + a++ - a++ - --b; a = 6 , b = 4
        // 5 - 4 - 6 + b-- + a++ - a++ - --b; a = 7 , b = 4
        // 5 - 4 - 6 + 4 + a++ - a++ - --b; a = 7 , b = 3
        // 5 - 4 - 6 + 4 + 7 - a++ - --b; a = 8 , b = 3
        // 5 - 4 - 6 + 4 + 7 - 8 - 2; a = 9 , b = 2
        // 1 - 2 + 7 - 8 -2
        // 6 -8 -2
        // -4
        System.out.print(ketqua);
        3 : Câu điều kiện
        if else
        int a = 10;
        int b = 5;
        a > b : In ra biến kết quả có giá trị là 1;
        a < b : In ra biến kết quả có giá trị là -1;
        a == b : In ra biến kết quả có giá trị là 0;
        block scope {} : phạm vi dùng để chứa đoạn lệnh (statements)
        if (a < 10 && b >= 5){
            System.out.println("Có");
        }else{
            System.out.println("Không");
        }

        4 : Câu điều kiện rẽ nhánh (switch case)
        int thang = 2;
        switch (thang){
            case 1 : System.out.println("Quý 1");
                break;
            case 2 : System.out.println("Quý 1");
                break;
            case 3: System.out.println("Quý 1");
                break;
        }

        5 : Vòng lặp for

         1 --> 100 : In Số chẳn
        for (int i = 0; i <= 100 ; i+= 2) {
           System.out.println(i);
        }
         1 --> 100 : In Số lẻ
        for (int i = 1; i <= 100 ; i+= 2) System.out.println(i);

         1 --> 100 : In Số chia 3 dư 1
        for (int i = 1; i <= 100 ; i+= 3) System.out.println(i);

        6 : Vòng lặp while
        
         int a = 0;
         Sử dụng cho các vòng lặp mà chưa biết kích thước cụ thể
        while(a < 10){
            System.out.println(a);
            a++;
        }
        int a = 0;

        do {
            System.out.println(a);
        }while (a < 0);
        */
       


    }
}
