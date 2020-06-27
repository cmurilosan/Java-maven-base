package br.com.alura.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.function.Supplier;

class ProdutoTest {

    @Test
    public void verificaPrecoComImposto() {
        Produto bala = new Produto("Balinha de goma", 0.10);
        assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
    }
}