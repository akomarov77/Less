package lesson12;

import java.util.function.Supplier;

public class MySupplier implements Supplier<String> {
    @Override
    public String get() {
        return "from Class supplier";
    }
}
