public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        System.out.println(program.sum("Hello ","Method"));
    }
    String sum(String first, String second){
        return first + second;
    }
}
