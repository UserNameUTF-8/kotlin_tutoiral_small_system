package product

import java.io.BufferedOutputStream
import java.io.FileWriter
import java.io.OutputStream
import java.io.OutputStreamWriter


class Store(private val idStore: String, private var nameStore: String)  {

    private var listSection = mutableListOf<Section>()
    constructor(idStore: String, nameStore: String, listSection: MutableList<Section>) : this(idStore, nameStore) {
        this.listSection = listSection
    }


    fun addSection(s : Section) : Boolean {
        if(listSection.contains(s)) throw Exception("This section is exists")
        return listSection.add(s)
    }

    fun removeSection(s: Section) : Boolean {
        if(!listSection.add(s)) throw Exception("This section is not exists")
        return listSection.remove(s)
    }

    fun showSectins() {
        for (i in listSection) {
            print(i) // this will return the toString of Sectins
        }
    }

    fun getId() :String {
        return idStore
    }

    override fun equals(other: Any?): Boolean {
        if((javaClass != other?.javaClass)) throw Exception("Not This same Types")
        other as Store
        return other.getId() == idStore
    }


    fun registerStore() {
        var fileWriter_: FileWriter = FileWriter("register_$idStore.csv")
            if(listSection.size > 0) {

            fileWriter_.write("Section Id, Section Name, Section Location")
            for (section in listSection) {
                fileWriter_.write("\n")
                fileWriter_.write("${section.getIdSection()}, ${section.getName()}, ${section.getLocation()}")
                if(section.getListProducts().isNotEmpty()) {
                    fileWriter_.write("\n")
                    fileWriter_.write("Porduct Id, Product Name, Product Description, Product Price, Product Quentity")

                    for (product_ in section.getListProducts()) {
                        fileWriter_.write("\n")
                        fileWriter_.write(product_.csvFormat())
                    }
                }
            }
        fileWriter_.close()
    }
    }


}