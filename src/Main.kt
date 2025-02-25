class Heroi(val nome: String, val idade: Int, val tipo: String) {
    fun atacar() {
        val ataque = when (tipo.lowercase()) {
            "mago" -> "magia"
            "guerreiro" -> "uma espada"
            "monge" -> "artes marciais"
            "ninja" -> "uma shuriken"
            else -> "um ataque desconhecido"
        }
        println("O $tipo atacou usando $ataque")
    }
}

fun main() {
    val heroi1 = Heroi("Merlin", 150, "mago")
    val heroi2 = Heroi("Arthur", 35, "guerreiro")
    val heroi3 = Heroi("Shaolin", 28, "monge")
    val heroi4 = Heroi("Hanzo", 30, "ninja")
    val heroi5 = Heroi("Arthur", 35, "recruta")

    heroi1.atacar()
    heroi2.atacar()
    heroi3.atacar()
    heroi4.atacar()
    heroi5.atacar()
    heroi5.atacar()
    heroi5.atacar()

}