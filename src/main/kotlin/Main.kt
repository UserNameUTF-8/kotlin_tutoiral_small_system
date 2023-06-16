import product.Product
import product.Section
import product.Store
import product.gioLocation

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var s1 = Store("S1", "Hello_World")

    var section_ = Section("SectionOne", "SectionName", gioLocation(3.452525, 3.42442))
    var Product = Product("PorductOne", "ProductName", "this is a good product :)", 3.0, 4)
    section_.addProduct(Product)
    s1.addSection(section_)
    s1.registerStore()
}