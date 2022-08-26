package encap

open class Jogos(
    private var nomejogo: String,
    private var anojogo: Int,
    private var produtora: String,
    private var classeindicativa: Int,
    notaDoJogo: Int
) : ReviewJogo(notaDoJogo) {

    init {
        checarDados()
    }

    private var _jogos = mutableSetOf<String>()
    val jogos: Set<String> = _jogos
    open fun criarJogo() {
        println("Adicionar um jogo: ")
        nomejogo = readln()
        println("Insira o ano de lançamento: ")
        anojogo = readln().toInt()
        println("Adicionar a produtora do jogo: ")
        produtora = readln()
        println("Informe a classe indicativa: ")
        classeindicativa = readln().toInt()
    }

    open fun addSinopse() {

        println("Adicione uma sinopse ao jogo: ")
        val sinopse = readln()
    }

    open fun listarJogo() {
        println(_jogos)
    }


    fun checarDados() {
        if (nomejogo == "" || anojogo == null || produtora == "" || classeindicativa == null) {
            throw Exception("Favor preencher todos os campos corretamente!")
        }
    }

    override fun darNota() {

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

    override fun curtir() {

        var count = 0

        println("Você curtiu o jogo? ")
        println("Sim ou Não")
        val resp = readln()


        if (resp == "Sim" || resp == "sim") {
            count++
            numCurtidas += count
            println("Like: $numCurtidas")

        } else if (resp == "Não" || resp == "não") {
            count++
            numDislikes += count
            println("Dislike : $numDislikes")
        } else {
            println("Resposta inválida!")
        }
    }
}