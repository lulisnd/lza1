package Xm;

import java.util.ArrayList;

public class guanli {
    private ArrayList<Sutdent> sutdents = new ArrayList<>();
    private op op  = new sx1();
    public guanli (){
    Sutdent s1 = new Sutdent();
    sutdents.add(new Sutdent("李子昂",'男',100));
        sutdents.add(new Sutdent("李子昂1",'男',101));
        sutdents.add(new Sutdent("李子昂2",'男',102));
        sutdents.add(new Sutdent("李子昂3",'男',103));
    }
public void printok1(){
   op.printok(sutdents);
}
public void printcj1(){
        op.printcj(sutdents);
}
}
