import categorias.Terror
import encap.Jogos

fun main() {

    var listaJogos = listOf(
        Terror("Resident Evil 1 (Biohazard)", 1996, "Capcom", 18, 5),
        Terror("Devil May Cry", 2001, "Capcom", 18, 4),
        Terror("The Evil Within", 2014, "Bathesda Softworks", 18, 4),
        Terror("Stay Close", 2016, "Blind Bird", 18, 3),
        Terror("The Quarry", 2022, "Supermassive Games", 18, 3),
        Terror("Little Hope", 2020, "Supermassive Games", 18, 4),
        Terror("Until Dawn", 2015, "Supermassive Games", 18, 5),
        Terror("Stray", 2022, "BlueTwelve Studio", 10, 5),
        Terror("Phasmophobia", 2020, "Kinect Games", 12, 4),
        Terror("Dead By Daylight", 2016, "Behaviour Interactive", 18, 4),
        Terror("Silent Hill", 1999, "Konami", 18, 3),
        Terror("Ammesia", 2010, "Supermassive Games", 18, 3),
        Terror("Bioshock", 2016, "2k", 18, 4)
    )

    println("*** BEM-VINDO!!! ***")
    println("*** Games Factory Reviews ***\n")

    //colocar criar usuario


    while (true) {

        try {

            println("Menu: \n")

            println(
                "1- Ver o catálogo de Jogos\n" +
                        "2- Ver a descrição do jogo\n" +
                        "3- Avaliar um jogo\n" +
                        "4- Favoritos\n" +
                        "5- Sair\n"
            )

            println("Digite a opção que você deseja: ")
            var resp = readln().toInt()

            println("Opção escolhida: $resp\n")

            when (resp) {
                1 -> {
                    println("Lista de jogos: ")
                    listaJogos.forEach {
                        println(it.nomejogo)
                    }

                }

                2 -> {
                    do {
                        println("Qual jogo você deseja ver suas informações: ")
                        var selecionarJogo = readln()

                        var infoJogo: Terror? = null
                        listaJogos.forEach {
                            if (selecionarJogo == it.nomejogo) {
                                infoJogo = it
                            }
                        }
                        if (infoJogo != null) {
                            infoJogo!!.toString()
                        } else {
                            println("O jogo não existe na lista!")
                        }

                        println("Deseja voltar ao menu? 1 para não e outro número qualquer para retornar ao menu!\n")
                        var resposta = readln().toInt()

                    } while (resposta == 1)
                }

                3 -> {
                    do {
                        println("Qual jogo você deseja avaliar?")
                        var selecionarJogo = readln()


                        var jogo: Terror? = null //variável que serve para achar o jogo que vamos procurar na lista
                        listaJogos.forEach {
                            if (selecionarJogo == it.nomejogo) { //verifica se o selecionarJogo tem o mesmo nome que um jogo da lista
                                jogo = it //ele captura o jogo que achamos pelo nome
                            }
                        }
                        if (jogo != null) { //se o jogo for diferente de nulo, se abre a interface de dar nota
                            jogo!!.darNota()
                            jogo!!.curtir()
                        } else {
                            println("O jogo não existe na lista!")
                        }

                        println("Deseja voltar ao menu? 1 para não e outro número qualquer para retornar ao menu!\n")
                        var resposta = readln().toInt()

                    } while (resposta == 1)

                }


                5 -> break

            }
        } catch (e: Exception) {
            println("Opção inválida!")
        }
    }
}

