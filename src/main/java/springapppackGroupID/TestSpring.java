package springapppackGroupID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    static Computer computer = context.getBean("computer", Computer.class);
    public static void main(String[] args) {
        System.out.println(computer);
    }
}
