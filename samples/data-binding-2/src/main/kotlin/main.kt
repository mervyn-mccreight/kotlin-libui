import libui.ktx.*
import libui.ktx.databinding.*

fun main(args: Array<String>) {
    class Model {
        val textFieldModel = ModelEntry<String>("TextField")
        val passwordFieldModel = ModelEntry<String>("PasswordField")
        val searchFieldModel = ModelEntry<String>("SearchField")
    }

    val model = Model()

    appWindow(
            title = "Data-binding Example #2",
            width = 640,
            height = 480
    ) {
        vbox {
            label("TextField")
            textfield(modelEntry = model.textFieldModel)

            label("PasswordField")
            passwordfield(modelEntry = model.passwordFieldModel)

            label("SearchField")
            searchfield(modelEntry = model.searchFieldModel)
        }
    }
}
