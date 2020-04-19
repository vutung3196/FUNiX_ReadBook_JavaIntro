import org.jetbrains.annotations.NotNull;

public class UseArgument {

    public static void main(String @NotNull [] args) {

        System.out.printf("Hi %s.How are you?", args[0]);
    }
}