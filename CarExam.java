public class CarExam {

    
    public static void main(String[] args){
        String a = new String("Hello");
        String b = new String("Hello");
        String c = "Hello";
        String d = "Hello";
        
       
        System.out.println(b==c); //주소를 비교함 따라서 둘이 다름
        System.out.println(c==d); //이 둘은 아예 같음 
        System.out.println(a==b); //그러나 new로 만든 객체는 다름.
        System.out.println(a.equals(b)); //a와 b를 글자만 비교하면 equals함수 둘의 글자는 같음.
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        
    }
    
}



//결과

// false
// true      
// false     
// true      
// 942731712 
// 971848845 
// 1910163204
// 1910163204
