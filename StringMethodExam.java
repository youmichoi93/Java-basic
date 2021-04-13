public class StringMethodExam {
    public static void main(String[] args){
        String str = new String("hello");
        String str2 = " youmi";
        String str3 = "hello";   //불변클래스(1) : str 과 str3 모두 같은 글자, hello를 참조함.
        //String str = "hello"; , String class는 빈번히 사용되어 이렇게 new키워드 없이 객체 생성가능.
        System.out.println(str.length());  
        System.out.println(str2.length());
        System.out.println(str.concat(str2));   
        System.out.println(str);  
        // 불변클래스(2) : 두 객체 모두 hello 를 참조함, 바뀌면 다른 객체에 영향을 줌. 따라서, String 클래스는 한 번 만들어진 객체를 바꾸지 않음. 
      


        System.out.println(str.concat(" world"));
        System.out.println(str);
        //str이 참조하는 레퍼런스는 바뀌않음. str은 그대로 "hello"를 가리킴.
        //따라서 str이 "hello world"를 참조하게 하려면
        str = str.concat(" world"); //str이 hello world를 가리키도록 코드를 작성필요.
        System.out.println(str);  //이제는 str이 hello world를 가르킴.



        // [substring함수] 
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 12));
    }
}
