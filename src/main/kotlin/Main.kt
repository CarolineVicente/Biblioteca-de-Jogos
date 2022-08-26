import encap.Usuario

fun main() {

    var listaUsuario = mutableListOf<Usuario>()
    var nick = ""
    var senha = ""
    var confirmarsenha = ""
    var idade = 0

    while (true) {

        print("Digite seu nome: ")
        var nome = readln()

        print("Digite seu e-mail: ")
        var email = readln()

        while (true) {

            print("Digite sua senha: ")
            senha = readln()

            print("Confirme a sua senha: ")
            confirmarsenha = readln()

            if(confirmarsenha != senha){
                println("As senhas precisam ser iguais! ")
            } else {
                break
            }
        }
        while (true){
            try {
                print("Digite a sua idade: ")
                idade = readln().toInt()
                break
            } catch (e: Exception){
                println("Valor invalido! Digite novamente!")
            }
        }

        while (true) {
            print("Digite seu nick: ")
            nick = readln()

            var auxiliar = false
            listaUsuario.forEach {
                if (nick == it.nick) {
                    auxiliar = true
                }
            }

            if (auxiliar) {
                println("Nick ja existente! ")
            } else {
                break
            }


        }

        var usuario1 = Usuario(nome, email, senha, confirmarsenha, nick, idade)
        listaUsuario.add(usuario1)

    }
}