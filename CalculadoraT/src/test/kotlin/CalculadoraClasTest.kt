import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraClasTest{

    @Test
    fun resultSomatest() {
        assertEquals(10,CalculadoraClas.resultSoma(5 ,5))
    }
    @Test
    fun Resultsubtest() {
        assertEquals(7,CalculadoraClas.Resultsub(9,2))
    }
    @Test
    fun  Resultmtest() {
        assertEquals(8,CalculadoraClas.Resultm(2 ,4))
    }

    @Test
    fun  ResultD() {
        assertEquals(8,CalculadoraClas.ResultD(16 ,2))
    }
}