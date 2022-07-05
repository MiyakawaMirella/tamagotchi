class BichinhoVirtualPlus {
    var nome: String = ""
    var comida: Int = 8
    var saude: Int = 8
    var tedio: Int = 3
    var insanidade: Int = 0
    var idade: Int = 0
    var listaNum = listOf<Int>(1, 2, 3)

    fun alterarNome(): String {
        println("Qual é o nome do seu Tamagushi?")
        var info1 = readLine() ?: ""
        this.nome = info1

        return this.nome
    }

    fun tedioC(valor:Int): Int{
        if (this.tedio == 10){
            this.insanidade = this.insanidade + valor
        } else if (this.tedio < 0){
            this.tedio = this.tedio + valor
        }
        return this.tedio
    }

    fun alimentar(): Int {
        this.comida = this.comida + 2
        if (this.comida > 10){
            this.calcularHumor()
        }

        var saude = listaNum.random()
        while (saude > this.saude + 1){
            saude = listaNum.random()
        }

        this.saude = this.saude - saude
        this.tedioC(2)

        println("${this.reagir()}")
        return this.comida
    }

    fun cuidarDaSaude(): Int {
        this.saude = this.saude + 2

        var comida = listaNum.random()
        while (comida > this.comida + 1){
            comida = listaNum.random()
        }

        this.comida = this.comida - comida
        this.tedioC(2)

        println("${this.reagir()}")
        return this.saude
    }

    fun brincar() {
        fun joquempo(){

        }
    }

    fun envelhecer(): Int {
        this.idade = this.idade + 1

        if (this.idade in 5..9){
            this.tedioC(2)
            this.insanidade = this.insanidade + 2
            this.saude = this.saude - 3
            this.comida = this.comida - 2
        } else if (this.idade == 10){
            this.saude = 0
        } else{
            this.tedioC(4)
            this.saude = this.saude - 2
            this.comida = this.comida - 3
        }
        println("${this.reagir()}")
        return this.idade
    }

    fun calcularHumor(){

        if(this.saude <= 0 && this.insanidade >= 10){
            println("Seu tamagushi morreu de tanto birutar, LOUCO LOUCO")
            this.idade = 0
            this.saude = 8
            this.comida = 8

            println("Adote um Tamagushi! Tente não birutar o seu bichinho dessa vez")
            this.alterarNome()
        } else if (this.comida <= 0 || this.saude <= 0 || this.comida > 10 || this.saude > 10){
            println("VOCÊ MATOU O SEU BICHINHO! SEU MONSTROOOOO!!")
            this.idade = 0
            this.saude = 8
            this.comida = 8

            println("Adote um Tamagushi!")
            this.alterarNome()
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

    fun reagir(): Any {
        var listaDeHumor = listOf<Boolean>(true, false)
        var reacao = listaDeHumor.random()
        var reacaoP: Any = ""

        if (reacao == true){
            reacaoP = this.calcularHumor()
        }
        return reacaoP
    }

    fun printarPrint(): Any{
        if (this.insanidade != 0){
            return println("Nome: ${this.nome}  Saúde: ${this.saude}  Comida: ${this.comida}  Idade: ${this.idade}Insanidade: ${this.insanidade}")
        } else {
            return println("Nome: ${this.nome}  Saúde: ${this.saude}  Comida: ${this.comida}  Idade: ${this.idade}  Tédio: ${this.tedio}")
        }
    }

    fun printar(){
        if (this.saude <= 0 ){
            this.calcularHumor()
        }
        if (this.comida <= 0 ){
            this.calcularHumor()
        }

        println("O que deseja fazer o que com o seu tamagushi?")
        println("N = Nome / S = Saúde / A = Alimentar / E = Envelhecer / B = Brincar")
        var acao = (readLine() ?: "").uppercase()

        if (acao == "N"){
            this.alterarNome()
            this.printarPrint()
        } else if (acao == "A"){
            if(this.comida < 10){
                this.alimentar()
            } else {
                this.calcularHumor()
                this.printar()
            }
            this.printarPrint()
        } else if (acao == "S") {
            if(this.saude < 10){
                this.cuidarDaSaude()
            } else {
                this.calcularHumor()
                this.printar()
            }
            this.printarPrint()
        } else if (acao == "E"){
            this.envelhecer()
            this.printarPrint()
        } else {
            println("Ação inválida")
        }

        println()
    }
}

fun main() {
    var tamagushi = BichinhoVirtualPlus()

    while (true){
        tamagushi.printar()
    }

}