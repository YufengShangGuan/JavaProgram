package Java_FirstSeason;

import java.sql.SQLOutput;

public class F_1 {

    /*功能描述：为指定成绩加分，直到分数大于等于 60 为止，
      输出加分前和加分后的成绩，并统计加分的次数。
    */

    /*
    //我的代码
    public static void main(String[] args){

        // 变量保存成绩
        int score = 53;

        // 变量保存加分次数
        int count = 0;

        //打印输出加分前成绩
        System.out.println("加分前成绩:"+score);

        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        for(int i=0;;i++)
        {
            if(score<60)
            {
                score+=1;
            }else
            {
                System.out.println("加分后成绩:"+score);
                System.out.println("共加了"+i+"次！");
                break;
            }
        }

        //打印输出加分后成绩，以及加分次数



    }
    */

    //标准代码
    public static void main(String[] args){
        int score=53;//成绩
        int count=0;//加的次数

        //输出加分前的成绩
        System.out.println("加分前成绩:"+score);

        //当成绩小于60时进行循环
        while(score<60)
        {
            score+=1;//成绩每次加1
            count++;//次数每次加1
        }

        //输出加分后的成绩和加的次数
        System.out.println("加分后成绩:"+score);
        System.out.println("共加了"+count+"次！");
    }



}
