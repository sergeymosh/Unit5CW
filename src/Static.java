public class Static {
    public static void main(String[] args) {
        System.out.println(qwerty.sum("Hello ","World"));
    }

}
class qwerty{
    static String sum(String first, String second){
        return first + second;
    }
}
