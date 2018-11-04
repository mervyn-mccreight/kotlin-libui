import libui.ktx.*
import libui.ktx.databinding.*

fun main(args: Array<String>) {
    class Model {
        val myString = ModelEntry<String>("Hello kotlin-libui!")
    }
    val model = Model()

    appWindow(
        title = "Data-binding Example #1",
        width = 320,
        height = 100
    ) {
        vbox {
            label(modelEntry = model.myString)
            textfield(modelEntry = model.myString)
        }
    }
}
