package Xm;

import java.util.ArrayList;

public class sx1 implements op{

    @Override
    public void printok(ArrayList<Sutdent> sutdents) {
        System.out.println("所有信息");
        int cot = 0;
        int cot1 = 0;
        for (int i = 0; i < sutdents.size(); i++) {
            Sutdent s = sutdents.get(i);
            System.out.println("姓名" + s.getName() + "成绩" + s.getSocre());
            if (s.getSex() == '男'){
              cot ++;
            }else {
                cot1 ++;
            }
        }
        System.out.println("男生有" + cot + "女生有" + cot1);
        System.out.println("----------------------------------");
    }

    @Override
    public void printcj(ArrayList<Sutdent> sutdents) {
        double n = 0.0;
        double max = sutdents.get(0).getSocre();
        double min = sutdents.get(0).getSocre();
        for (int i = 0; i < sutdents.size(); i++) {
            Sutdent s = sutdents.get(i);
            if (s.getSocre() > max) {
                max = s.getSocre();
            }
            if (s.getSocre() < min){
                min = s.getSocre();
            }
            n += s.getSocre();
        }
        System.out.println("最高分是" + max + ",最低分是" + min);
        System.out.println("平均分" + (n - max - min)/sutdents.size());
    }
}
