package Java_FirstSeason;
import java.sql.SQLOutput;
import java.util.Arrays;
public class F_6_8 {
    public static void main(String[] args)
    {
        // 定义一个整型数组，保存成绩信息
        int[] scores = {89, 72, 64, 58, 93};

        // 对Arrays类对数组进行排序
        Arrays.sort(scores);

        // 对Arrays类对数组进行输出
        System.out.println(Arrays.toString(scores));

        // 使用foreach遍历输出数组中的元素
        for (int score : scores)
        {
            System.out.println(score);
        }



        // 定义两行三列的二维数组并赋值
        // String[][] names=new String[1][2];
        // names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
        String[][] names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
        // 通过二重循环输出二维数组中元素的值
        for (int i = 0; i <names.length; i++)
        {
            for (int j = 0; j < names[i].length; j++)
            {
                System.out.println(names[i][j]);
            }
            System.out.println();
        }
    }
}
