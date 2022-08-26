package encap

abstract class ReviewJogo(
    var notaDoJogo: Int
){

    var numCurtidas = 0
    var numDislikes = 0

    open fun darNota() {

        println("Dar nota de 1 a 5 para o jogo: ")
        println("1 para ruim e 5 para gostei muito")
        var nota = readln().toInt()

        nota = notaDoJogo

        if (nota in 1..5) {
            println("Nota cadastrada com sucesso!")
        } else {
            println("Valor de $nota inválido! Digite um novo valor.")
        }
    }

    open fun curtir() {

        var count = 0

        println("Você curtiu o jogo? ")
        println("Sim ou Não")
        var resp = readln()

        if (resp == "Sim" && resp == "sim") {
            count++
            numCurtidas += count
            println("Like: $numCurtidas")

        } else {
            count++
            numDislikes += count
            println("Dislike : $numDislikes")
        }
    }
}