package exten;

public class lizi {
    public static void main(String[] args) {
        String name = "liziang";
        System.out.println(name);

       char[] chars = {'a','l','z'};
       String sr = new String(chars);
        System.out.println(sr);

        byte[] xc = {97,98,99};
        String sr1 = new String(xc);
        System.out.println(sr1);

        String s1 = "liziang";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            System.out.println(ch);

        String s2 = "LIZIANG";

            System.out.println(name.equals(s1));
            System.out.println(name.equalsIgnoreCase(s2));

            String sc = s1.substring(8);
            System.out.println(sc);

            String info = "男生李子昂";
            String info1 = info.replace("男生","帅哥");
            System.out.println(info1);

            String info2 = "李子昂帅";
            System.out.println(info2.contains("帅"));

            String li = "李子昂";
            System.out.println(li.startsWith("李"));

            String wbg = "李子昂,wbg,theshy";
            String[] wbg1 = wbg.split(",");
            for (int j = 0; j < wbg1.length; j++) {
                System.out.println(wbg1[i]);
            }

        }
    }

}
