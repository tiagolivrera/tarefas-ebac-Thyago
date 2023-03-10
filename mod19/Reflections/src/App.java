import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws Exception {
        Method[] metodos = Teste.class.getMethods();
        for (Method method : metodos) {
            if (method.isAnnotationPresent(Tabela.class)) {
                Tabela tb = method.getAnnotation(Tabela.class);
                System.out.println(tb.value());
            }
        }
    }

}
