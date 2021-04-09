import org.graalvm.compiler.nodes.StaticDeoptimizingNode;

import jdk.tools.jlink.resources.plugins;

public class IfExam {

    public static void main(String[] args) {
        int x = 50;
        int y = 60;

        // if(x > y ) {
        //     System.out.println("x는 y보다 작습니다.");
        //     System.out.println("test 1");

        // }

        // if(x > y )   //괄호가 없을 경우 한 행만 영향을 받아 두번째 행은 조건과 상관없이 그냥 찍어냄.
        //     System.out.println("x는 y보다 작습니다.");
        //     System.out.println("test 2");


        if(x==y) {
            System.out.println("x는 y와 같습니다.");
        }else if(x>y) {
            System.out.println("x는 y보다 큽니다.");
        // }else if(x < y){
        //     System.out.println("x는 y보다 작습니다.");
        // }
        }else {
            System.out.println("x는 y와 다릅니다.");
        }
    }
}