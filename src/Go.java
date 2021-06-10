public class Go {
    public static void main(String[] args) {
      Res res = new Res();
        System.out.println(res.del(89,4));
        res.String("hhh ","kkk ","ttt");
    }
}
class Res{
    double del(double a,double b){
        return a/b;
    }
    void String (String str1, String str2, String str3){
        System.out.print(str1+str2+str3);
    }
}