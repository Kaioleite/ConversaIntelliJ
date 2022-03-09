fun main() {
   //*** Calculadora com Função Com retorno ***
    print("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()
    print("Digite a operação , + - * / :  ")
    val oper = readLine()!!
    print("Digite o segundo número:")
    val num2 = readLine()!!.toInt()
    println("A soma de todos os número é:")


    if (oper == "+") {
        print("o resultado da soma é ${CalculadoraClas.resultSoma(num1, num2)}")
    }
    else if (oper == "-") {
        print("o resultado da soma é ${CalculadoraClas.Resultsub(num1, num2)}")
    }
    else if (oper == "*") {
        print("o resultado da soma é ${CalculadoraClas.Resultm(num1, num2)}")
    }
    else if (oper == "/") {
        print("o resultado da soma é ${CalculadoraClas.ResultD(num1, num2)}")
    }
    else {
        print("Resultado inválido")
    }
}



