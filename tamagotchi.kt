class Tamagushi(nome: String, comida: Int, saude: Int, idade: Int, vivo: Boolean, insanidade: Int, tedio: Int){
    var nome = nome;
    var comida = comida;
    var saude = saude;
    var idade = idade;
    var lista = listOf<Int>(1, 2, 3, 4)
    var vivo = vivo;
    var insanidade = insanidade;
    var tedio = tedio;
    var vidaDoUsuario = true
    var contador: Int = 0;
    var dinheiro: Int = 0;
    
        fun dinheiro(moedas: Int){
        if(moedas < 0){
            this.dinheiro -= moedas
                if(this.dinheiro < 0){
                    this.dinheiro = 0
                }
        }
        else{
            this.dinheiro += moedas
        }
    }

    fun historia(){
        contador += 1

        if(contador == 1){
            print("Vou contar a historia do dia em que fui ao zoologico!")
            var leitura = readLine()?: ""
            print("Era uma tarde ensolarada, quando fui visitar diversos animaizinhos")
            var leitura2 = readLine()?: ""
            print("Foi muito divertido, conheci a senhora zebra, o senhor leao, o senhor macaco, a senhora cobra e a " +
                    "amiga jabuti")
            var leitura3 = readLine()?: ""
            print("Quando cheguei em casa estava com tanto soninho que acabei dorminfo fácil!")
            var leitura4 = readLine()?: ""
            println("Espero logo logo ir novamente! Fim da historia do meu dia no zoologico.")
            println("Sua insanidade: $insanidade")
        }else if(contador == 2){
            print("Vou contar a historia do dia em fui atras de um tesouro!")
            var leitura5 = readLine()?: ""
            print("Era uma tarde calma, eu e meus amigos encontramos um mapa e resolvemos seguir ate o X")
            var leitura6 = readLine()?: ""
            print("Foi uma longa jornada pelo parquinho, subimos montanhas (escorregador), enfrentamos monstros " +
                    "(gangorra e")
            var leitura7 = readLine()?: ""
            print("viajamos de barco (balanco)! No final chegamos ao X em um mar de areia (caixa de brincar) e foi " +
                    "muito divertido")
            var leitura8 = readLine()?: ""
            println("Espero logo logo brincar novamente! Essa foi a historia da caca ao tesouro!")
            println("Sua insanidade: $insanidade")
        }else if(contador == 3){
            print("Vou contar a historia do dia em que resgatei um gatinho!")
            var leitura5 = readLine()?: ""
            print("Era um dia chuvoso, quando ouvi do lado de fora da minha porta um miado bem baixinho")
            var leitura6 = readLine()?: ""
            print("Foi até lá ver o que era e descobri que era um pequeno gatinho todo encolhido e morrendo de frio!")
            var leitura7 = readLine()?: ""
            print("Levei ele para dentro, dei um belo banho e cuidei muito bem até que ele ficasse muuuito saudável!")
            var leitura8 = readLine()?: ""
            println("Agora ele esta morando comigo, pelo menos por um tempo! Essa foi a historia de quando encontrei " +
                    "um gatinho!")
            println("Sua insanidade: $insanidade")
        }else if(contador == 4){
            print("Vou contar a historia do dia em que fui na americanas!")
            var leitura5 = readLine()?: ""
            print("Era um dia animado, resolvi ir comprar alguns ingredientes para meu bolo nas lojas Americanas")
            var leitura6 = readLine()?: ""
            print("Chegando la peguei tudo que eu ia precisar para minha receita e fui em direcao a caixa")
            var leitura7 = readLine()?: ""
            print("Enquanto eu esperava pagar vi alguns doces e fiquei com muita vontade, mas nao tinha dinheiro " +
                    "suficiente, entao os enfiei emmeu bolso sem ninguem ver!")
            var leitura8 = readLine()?: ""
            println("Nao me arrependo! Essa foi a historia do meu primeiro roubo!")
            println("Sua insanidade: ${this.insanidade+1}")
        }else if(contador == 5){
            print("Vou contar a historia do melhor jantar da minha vida!")
            var leitura9 = readLine()?: ""
            print("Certo dia cheguei em minha casa e encontrei um vaso quebrado no chao, unica explicativa para " +
                    "aquela bagunca era meu gatinho ter derrubado")
            var leitura10 = readLine()?: ""
            print("Fui o porcurar e quando o encontrei percebi que estava tao gordinho quanto eu queria que ele " +
                    "estivesse!")
            var leitura11 = readLine()?: ""
            print("Segurei, torci e empalhei direitinho, por fim no faltou cozinhar na fogueira!")
            var leitura12 = readLine()?: ""
            println("Foi o jantar mais delicioso que ja tive, meu querido gatinho!")
            println("Sua insanidade: ${this.insanidade+2}")
        }else if(contador == 6){
            print("Lobo bobo, bobo lobo, sua pele impura fica tao linda enquanto me esquenta!")
            var leitura13 = readLine()?: ""
            print("Tola nao foi a chapeuzinho que com o machado cortou sua cabeca e fez suas tripas de janta!")
            var leitura14 = readLine()?: ""
            print("O que foi? Esta com medo? Sou eu, ${this.nome}, nao tem porque se assustar...")
            var leitura15 = readLine()?: ""
            print("Pelo menos nao ate a proxima historia")
            var leitura16 = readLine()?: ""
            println("haha hahaha ha haha ha hahahaha haha hahaha ha")
            println("Sua insanidade: ${this.insanidade+10000}")
        }
    }


    fun adotar() {
        if (vivo == true) {
            this.repetir()

        } else {
            if(vidaDoUsuario == true){
                print("Deseja adotar um novo tamagushi? (S ou N) ")
                var read3 = readLine() ?: ""
                var pick = read3
                if (pick == "S") {
                    this.vivo = true
                    if (vidaDoUsuario == false) {
                        print("Você morreu, te encontraremos na próxima vida!")
                    }
            }else if(pick == "N"){
                    print("Obrigada por jogar!")
                }

            }else{
                print("Obrigada por jogar!")
            }
        }

    }

    fun comer(){
        if(comida != 10){
            if(comida > 0){
                this.comida += lista.random()
                this.saude -= lista.random()
                println("${this.nome} esta com ${this.comida} de comida e ${this.saude} de saude!")
                if(this.saude <= 0){
                    this.calcularHumor()
                    calcularTedio(2)
                    this.vivo = false
                }
            }
            else{
                this.calcularHumor()
                this.vivo = false
            }
        }
        else{
            this.saude -= lista.random()
            if(this.saude <= 0){
                this.calcularHumor()
                this.vivo = false
            }
            else{
                this.calcularHumor()
                calcularTedio(2)
                println("${this.nome} esta com ${this.comida} de fome e ${this.saude} de saude!")
            }
        }
    }

    fun cuidarSaude(){
        if(saude != 10){
            if(saude > 0){
                this.saude += lista.random()
                this.comida -= lista.random()
                println("${this.nome} esta com ${this.comida} de fome e ${this.saude} de saude!")
                if(this.comida <= 0){
                    this.calcularHumor()
                    this.vivo = false
                }
            }
            else{
                this.calcularHumor()
                this.vivo = false
            }
        }
        else{
            this.comida -= lista.random()
            if(this.comida <= 0){
                this.calcularHumor()
                this.vivo = false
            }
            else{
                calcularTedio(3)
                println("${this.nome} esta com ${this.comida} de fome e ${this.saude} de saude!")
            }
        }
    }

    fun nomear(){
        print("Digite aqui o nome do seu tamagushi: ")
        var read = readLine()?: ""
        this.nome = read
        println("${this.nome} esta com ${this.comida} de fome e ${this.saude} de saude!")
    }

    fun repetir(){
        print("Nomear (N) || Alimentar (A) || Saude (S): || Brincar (B): || Envelhecer (E): ")
        var escolha = (readLine()?: "").uppercase()

        if(vivo == true){
            this.reagir()
        }

        if(escolha == "N"){
            this.nomear()
        } else if(escolha == "A"){
            this.comer()
        } else if(escolha == "S"){
            this.cuidarSaude()
        } else if (escolha == "B"){
            this.brincar()
        } else if (escolha == "E"){
            this.envelhecer()
        }
    }

    fun calcularTedio(valor:Int): Int{
        if (this.tedio == 10){
            this.insanidade += valor
        } else if (this.tedio < 0){
            this.tedio += valor
        }
        return this.tedio
    }

    fun envelhecer(): Int {
        this.idade = this.idade + 1

        if (this.idade in 5..9){
            this.calcularTedio(2)
            this.insanidade = this.insanidade + 2
            this.saude = this.saude - 3
            this.comida = this.comida - 2
        } else if (this.idade == 10){
            this.saude = 0
        } else{
            this.calcularTedio(4)
            this.saude = this.saude - 2
            this.comida = this.comida - 3
        }
        println("${this.reagir()}")
        return this.idade
    }

    fun roletaRussa(){
        println("Girando o tambor da arma...")
        println("...")
        val listaAleatoria = listOf<Int>(1, 2, 3, 4, 5, 6)
        var tamagotchi = listaAleatoria.random()
        var usuario = listaAleatoria.random()

        println("*Puxa gatilho!*")

        if (tamagotchi == 1){
            this.vivo = false
            println("O tamagutshi morreu")
            this.adotar()

            if (usuario == 1){
                println("Você está vivo")
                this.adotar()
            }
        } else if (usuario == 1){
            this.vidaDoUsuario = false
            println("Você morreu")
            this.adotar()

            if (tamagotchi == 1){
                this.vivo = true
                print("O tamagutshi está vivo")
                this.adotar()
            }
        } else if (usuario != 1 && tamagotchi != 1){
            println("Que sorte! Todos estão vivos ainda")
        }

    }

    fun cacaNiquel(){
        var listaDePossibilidades = listOf<String>("Maça", "Banana", "Laranja")
        var casa1 = listaDePossibilidades.random()
        var casa2 = listaDePossibilidades.random()
        var casa3 = listaDePossibilidades.random()
        
        println()
    }

    fun brincar(){
        var opcao: String = ""

        if (insanidade >= 4){
            println("historias || roleta russa")
            opcao = readLine()?: ""

            if (opcao == "historias"){
                this.historia()
            } else if(opcao == "roleta russa") {
                this.roletaRussa()
            }
        } else {
            println("historias || ")
            opcao = readLine()?: ""

            if (opcao == "historias"){
                this.historia()
            }
        }
    }

    fun reagir(): Any {
        var listaDeHumor = listOf<Boolean>(true, false)
        var reacao = listaDeHumor.random()
        var reacaoP: Any = ""

        if (reacao == true){
            reacaoP = this.calcularHumor()
        }
        return reacaoP
    }

    fun calcularHumor(){

        if(this.saude <= 0 && this.insanidade >= 10){
            println("Seu tamagushi morreu de tanto birutar, LOUCO LOUCO")

        } else if (this.comida <= 0 || this.saude <= 0 || this.comida > 10 || this.saude > 10){
            println("VOCÊ MATOU O SEU BICHINHO! SEU MONSTROOOOO!!")

        } else if (this.tedio >= 5){
            println("Eu vou morrer de tédioooooo!! Brinca comigo??")

        } else if (this.comida in 5..9 && this.saude in 5..9){
            println("Estou muito mal! Cuide de mim!")

        } else if (this.comida in 5..9 && this.saude < 5){
            println("Estou com fomeee!! ME ALIMENTE!")

        } else if (this.comida < 5 && this.saude in 5..9){
            println("Estou dodói, me leve no hospital!")

        }  else if (this.saude >= 10){
            println("O seu Tamagushi está bem! Deixa ele brincar!")

        } else if (this.comida >= 10) {
            println("O seu Tamagushi está de bucho cheio, vai explodir ele vovó")

        } else {
            println("Estou muito bem!! Vamos brincar??")
        }

    }
}

fun main(){
    var tamagushi = Tamagushi("", 10, 10, 0, true, 0, 3)

    while(true){
        tamagushi.adotar()
    }
}
