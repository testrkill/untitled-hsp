public class Test1 {
     int  count=0;
    String def;
    public  Test1(String def){
        count++;
        this.def=def;
    }
    public static  void main(String[] args) {
        Test1 c1 = new Test1("zhang");
        System.out.println(c1.count+c1.def);
        Test1 c2 = new Test1("chao");
        System.out.println(c2.count+c2.def);
//        System.out.println(Test1.def);
    }


}
