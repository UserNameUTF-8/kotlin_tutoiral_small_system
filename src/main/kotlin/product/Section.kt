package product
import java.util.*


class Section(
    private val idSection: String,
    private var nameSection: String,
    private var locationSection: gioLocation
    )
{

    private var listProducts = mutableListOf<Product>()
    constructor(idSection: String,nameSection: String, locationSection: gioLocation, listProducts:MutableList<Product>): this(idSection, nameSection, locationSection) {
        this.listProducts = listProducts;
    }


    fun getListProduct() {
        for(i in listProducts) {
            print(i) // show toString of listProduct
        }
    }

    fun getIdSection () : String {
        return idSection
    }





    fun addProduct(p : Product) : Boolean{
        if(listProducts.contains(p)) throw Exception("This Product is already exists")
        return listProducts.add(p)
    }

    fun removeProduct(p: Product) : Boolean{
        return listProducts.remove(p)
    }

    fun getLocation() : gioLocation{
        return locationSection;
    }

    fun getName() : String{
        return nameSection
    }

    fun getListProducts() : Collection<Product> {
        return listProducts
    }

    override fun toString(): String {
        return "$nameSection $locationSection"
    }


    override fun equals(other: Any?): Boolean {
        if(javaClass == other?.javaClass) {
            other as Section
            return other.idSection == idSection
        }

        return false
    }



}