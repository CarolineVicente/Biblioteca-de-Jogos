package encap

open class Jogos(
    private var nomejogo: String,
    private var anojogo: Int,
    private var produtora: String,
    private var classeindicativa: Int
) : ReviewJogo() {

    init {
        checarDados()
    }
    private var _jogos = mutableSetOf<String>()
    val jogos: Set <String> = _jogos
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

    open fun listarJogo () {
        println(_jogos)
    }

    open fun exibirJogo (){
        if(){

        }
    }
    fun checarDados(){
        if (nomejogo == "" || anojogo == null || produtora == "" || classeindicativa == null) {
            throw Exception   ("Favor preencher todos os campos corretamente!")
        }
    }
}