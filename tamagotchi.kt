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
            print("Era uma tarde calma, eu e meus amigos encontramos um mapa re resolvemos segui rate o X")
            var leitura6 = readLine()?: ""
            print("Foi uma longa jornada pelo parquinho, subimos montanhas (escorregador), enfrentamos monstros " +
                    "(gangorra e")
            var leitura7 = readLine()?: ""
            print("viajamos de barco (balanco)! No final chegamos ao X em um mar de areia (caixa de brincar) e foi " +
                    "muito divertido")
            var leitura8 = readLine()?: ""
            println("Espero logo logo brincar novamente! Essa foi a historia da caca ao tesouro!")
            println("Sua insanidade: $insanidade")
        }
    }


    fun adotar(){
        if(vivo == true){
            this.repetir()

        }
        else{
            print("Deseja adotar um novo tamagushi? (S ou N) ")
            var read3 = readLine()?: ""
            var pick = read3
            if(pick == "S" && vidaDoUsuario == true){
                this.vivo = true
            }
            else{
                if (vidaDoUsuario == false) {
                    print("Você morreu, te encontraremos na próxima vida!")
                } else {
                    print("Obrigada por jogar!")
                }
            }
        }
    }

    fun comer(){
        if(comida != 10){
            if(comida > 0){
                this.comida += lista.random()
                this.saude -= lista.random()
                println("${this.nome} esta com ${this.comida} de comida e ${this.saude} de saude!")
                if(this.saude == 0){
                    this.calcularHumor()
                    calcularTedio(2)
                    this.vivo = false
                }
            }
            else{
                this.calcularHumor()
                calcularTedio(2)
                this.vivo = false
            }
        }
        else{
            this.saude -= lista.random()
            if(this.saude <= 0){
                this.calcularHumor()
                calcularTedio(2)
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
                if(this.comida == 0){
                    this.calcularHumor()
                    calcularTedio(3)
                    this.vivo = false
                }
            }
            else{
                this.calcularHumor()
                calcularTedio(3)
                this.vivo = false
            }
        }
        else{
            this.comida -= lista.random()
            if(this.comida <= 0){
                this.calcularHumor()
                calcularTedio(3)
                this.vivo = false
            }
            else{
                this.calcularHumor()
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
        this.reagir()

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
        val listaAleatoria = listOf<Int>(1, 2, 3, 4, 5, 6)
        var tamagotchi = listaAleatoria.random()
        var usuario = listaAleatoria.random()

        if (tamagotchi == 1){
            this.vivo = false
            this.adotar()

            if (usuario == 1){
                this.vidaDoUsuario = true
                this.adotar()
            }
        } else if (usuario == 1){
            this.vidaDoUsuario = false
            this.adotar()

            if (usuario == 1){
                this.vivo = true
                this.adotar()
            }
        } else if (usuario != 1 && tamagotchi != 1){
            println("Que sorte! Todos estão vivos ainda")
        }

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
                /*this.historia()*/
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
