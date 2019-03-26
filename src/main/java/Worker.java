import org.springframework.stereotype.Component;

@Component
public class Worker {
    private int id = 123;
    private String name = "Vasya";


    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
