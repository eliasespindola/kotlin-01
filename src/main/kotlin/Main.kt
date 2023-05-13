fun main() {
    val contaJoao = Conta("Joao", 1234)
    val contaElias = Conta("Elias", 1235)
    contaJoao.deposita(50.0)
    println(contaJoao.saldo)

    contaJoao.transfere(20.0, contaElias)

    println(contaElias.saldo)
}


class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


}
