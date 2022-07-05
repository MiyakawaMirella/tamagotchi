class Tamagushi(nome: String, fome: Int, saude: Int, idade: Int, vivo: Boolean){
    var nome = nome;
    var fome = fome;
    var saude = saude;
    var idade = idade;
    var lista = listOf<Int>(1, 2, 3, 4)
    var vivo = vivo;

    fun adotar(){
        if( vivo == true){
            this.repetir()

        }
        else{
            print("Deseja adotar um novo tamagushi? (S ou N) ")
            var read3 = readLine()?: ""
            var pick = read3
            if(pick == "S"){
                this.vivo = true
            }
            else{
                print("Obrigadda por jogar!")
            }
        }
    }

    fun comer(){
        if(fome != 10){
            if(fome > 0){
                this.fome += lista.random()
                this.saude -= lista.random()
                println("${this.nome} esta com ${this.fome} de fome e ${this.saude} de saude!")
                if(this.saude == 0){
                    println("Seu tamagushi esta morto!")
                    this.vivo = false
                }
            }
            else{
                println("Seu tamagushi esta morto!")
                this.vivo = false
            }
        }
        else{
            this.saude -= lista.random()
            if(this.saude <= 0){
                println("Seu tamagushi esta morto!")
                this.vivo = false
            }
            else{
                println("Seu tamagushi esta com o bucho cheio!")
                println("${this.nome} esta com ${this.fome} de fome e ${this.saude} de saude!")
            }
        }
    }

    fun cuidarSaude(){
        if(saude != 10){
            if(saude > 0){
                this.saude += lista.random()
                this.fome -= lista.random()
                println("${this.nome} esta com ${this.fome} de fome e ${this.saude} de saude!")
                if(this.fome == 0){
                    println("Seu tamagushi esta morto!")
                    this.vivo = false
                }
            }
            else{
                println("Seu tamagushi esta morto!")
                this.vivo = false
            }
        }
        else{
            this.fome -= lista.random()
            if(this.fome <= 0){
                println("Seu tamagushi esta morto!")
                this.vivo = false
            }
            else{
                println("Seu tamagushi esta muito saudavel!")
                println("${this.nome} esta com ${this.fome} de fome e ${this.saude} de saude!")
            }
        }
    }

    fun nomear(){
        print("Digite aqui o nome do seu tamagushi: ")
        var read = readLine()?: ""
        this.nome = read
        println("${this.nome} esta com ${this.fome} de fome e ${this.saude} de saude!")
    }

    fun repetir(){
        print("Nomear (N) || Alimentar (A) || Saude (S): ")
        var read2 = readLine()?: ""
        var escolha = read2

        if(escolha == "N"){
            this.nomear()
        }
        if(escolha == "A"){
            this.comer()
        }
        if(escolha == "S"){
            this.cuidarSaude()
        }
    }
}

fun main(){
    var tamagushi = Tamagushi("", 10, 10, 0, true)
    while(true){
        tamagushi.adotar()
    }
}
