fun main(){
    val contaJoao = Conta()
    contaJoao.deposita(50.0)
    println(contaJoao.saldo)
    contaJoao.saca(20.0)
    println(contaJoao.saldo)
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if(this.saldo >= valor){
            this.saldo -=valor;
        }
    }
}
