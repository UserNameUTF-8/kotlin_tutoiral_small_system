package product

class CommandItem(private var p : Product, private var qte: Int) {
    fun getProduct(): Product {
        return p
    }
    fun getQte(): Int {
        return qte
    }

    fun setQte(newQte: Int) {
        this.qte = newQte
    }
}