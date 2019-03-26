import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
        container.register(Worker.class);
        container.refresh();

        Worker bean = container.getBean(Worker.class);
        System.out.println(bean);



    }
}
