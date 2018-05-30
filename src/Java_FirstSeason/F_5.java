package Java_FirstSeason;

import  java.util.Scanner;

public class F_5 {
    public static void main(String[] args)
    {
        //实现接收三个班级的各四名学员的成绩信息，然后计算每个班级学员的平均分

        Scanner input=new Scanner(System.in);
        int classNum=3;
        int stuNum=4;
        double sum;
        double avg;
        for (int i=1;i<=classNum;i++)
        {
            sum=0;
            System.out.println("*****请输入第"+i+"个班级的成绩*****");
            for (int j=1;j<=stuNum;j++)
            {
                System.out.println("请输入第"+j+"个学生的成绩：");
                int score= input.nextInt();
                sum+=score;
            }
            avg=sum/4;
            System.out.println("*****第"+i+"个班级的平均成绩是"+avg+"*****");
        }





    }


}
