import java.util.Scanner

const val PREFIX = "[Calculadora] Resultado final: "

fun main() {

    println("[Calculadora] Por favor insira o primeiro número:")
    val scanner = Scanner(System.`in`)

    val primeiro_numero: Int = scanner.nextInt()

    println("[Calculadora] O primeiro número escolhido é: $primeiro_numero")

    val segundo_numero: Int = scanner.nextInt()

    println("[Calculadora] O segundo número escolhido é: $segundo_numero")

    println("[Calculadora] Escolha o operador que será realizado.")
    println("+ - * /")
    val operador: String = scanner.next()

    when (operador) {
        "+" -> println(PREFIX + (primeiro_numero + segundo_numero))
        "-" -> println(PREFIX + (primeiro_numero - segundo_numero))
        "*" -> println(PREFIX + (primeiro_numero * segundo_numero))
        "/" -> println(PREFIX + (primeiro_numero / segundo_numero))
        else -> println("[Calculadora] Número final inválido!")
    }
}