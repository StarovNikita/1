public class factorial {
    public static void main(){
        System.out.println(factorial.func(5));
    }
 static int func(int a){
        int result = 1;
        if (a==1||a==0){
            return result;
        }
        result = a*func(a-1);
        return result;
 }
}
