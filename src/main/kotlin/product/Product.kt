package product



class Product(
    private val idProduct: String,
    private var nameProduct: String,
    private var descriptionProduct: String,
    private var prixProduct : Double,
    private var qteProduct : Int
    ){


    private var is_rem = false
    private var amound_remise: Double = 0.0

    constructor(p : Product) :this(
        p.idProduct,
        p.nameProduct,
        p.descriptionProduct,
        p.prixProduct,
        p.qteProduct
    )
    init {
        print("New Product")
    }

    init {
        print("Second Constructor New Procut")
    }


    fun getId(): String {return idProduct}
    fun getName() : String { return nameProduct}
    fun getDesc() : String{ return descriptionProduct}
    fun getPrix() : Double{ return prixProduct}
    fun getQte(): Int { return qteProduct}


    fun setName(name: String) {
        this.nameProduct = name
    }
    fun setDesc(description:String){
        this.descriptionProduct = description
    }
    fun setPrix(prix:Double){
        this.prixProduct = prix
    }
    fun setQte(qte: Int) {
        this.qteProduct = qte
    }


    fun quentityDecirment() {
        this.qteProduct -= 1
    }

    fun priceMenus(amount: Double) {
        this.prixProduct -= amount
    }

    fun priceAdd(amount: Double) {
        this.prixProduct += amount
    }


    fun remise(amound: Double, is_in_remise: Boolean) {
            if(!is_in_remise) throw Exception("no amount are req here")
            if (is_rem) throw Exception("this product is alreay in remise")
            is_rem = true
            prixProduct -= amound
            amound_remise = amound
    }

    fun remise(is_in_remise: Boolean) {
        if(is_in_remise) throw Exception("Massing Parametre Of amount")
        if (!is_rem) throw Exception("this procut not in remise")
        is_rem = false
        prixProduct += amound_remise
        amound_remise = 0.0
    }

    override fun toString(): String {
        return "Product(idProduct='$idProduct', nameProduct='$nameProduct', descriptionProduct='$descriptionProduct', prixProduct=$prixProduct, qteProduct=$qteProduct)"
    }

    fun csvFormat() : String{
        return "$idProduct, $nameProduct, $descriptionProduct, $prixProduct, $qteProduct";
    }

    override fun equals(other: Any?): Boolean {
        other as Product
        return other.getId() == idProduct
    }


}