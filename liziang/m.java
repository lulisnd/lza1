package liziang;

import java.util.Scanner;

public class m {
    public static void main(String[] args){
        movie[] movies =new movie[4];
        movie m1 = new movie(1,"傻子fmy",1,0.1,"fmy");
        movie m2 = new movie(2,"呆子fmy",1,0.2,"fmy");
        movie m3 = new movie(3,"大傻子fmy",1,0.2,"fmy");
        movie m4 = new movie(4,"大帅哥lza",100,10.0,"lza");
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
        movies[3] = m4;
        movieop mb = new movieop(movies);
        while (true) {
        System.out.println("--电影信息系统--");
        System.out.println("输入1查询所有电影");
        System.out.println("输入2查询单个信息");
        Scanner sc = new Scanner(System.in);
        int commd = sc.nextInt();

            switch (commd) {
                case 1:
                    mb.printmovies();
                    break;
                case 2:
                    System.out.println("输入id");
                    int id = sc.nextInt();
                    mb.searchmovie(id);
                    break;
                default:
                    System.out.println("有问题");
            }

        }
    }
}
