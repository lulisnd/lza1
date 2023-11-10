package Xm;

import java.util.ArrayList;

public class sx implements op{

    @Override
    public void printok(ArrayList<Sutdent> sutdents) {
        System.out.println("所有信息");
        for (int i = 0; i < sutdents.size(); i++) {
            Sutdent s = sutdents.get(i);
            System.out.println("姓名" + s.getName() + "成绩" + s.getSocre());

        }
        System.out.println("----------------------------------");
    }

    @Override
    public void printcj(ArrayList<Sutdent> sutdents) {
        double n = 0.0;
        for (int i = 0; i < sutdents.size(); i++) {
           Sutdent s = sutdents.get(i);
           n += s.getSocre();
        }
        System.out.println("平均分" + n/sutdents.size());
    }
}
