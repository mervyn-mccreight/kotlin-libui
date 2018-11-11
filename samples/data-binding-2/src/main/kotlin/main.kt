import libui.ktx.*
import libui.ktx.databinding.*

fun main(args: Array<String>) {
    class Model {
        val textFieldModel = ModelEntry<String>("TextField")
        val passwordFieldModel = ModelEntry<String>("PasswordField")
        val searchFieldModel = ModelEntry<String>("SearchField")
    }

    val model = Model()
    lateinit var values: TextArea

    val updateValues: ChangeListener<String> = {
        values.value = "${model.textFieldModel.value}\n" +
                "${model.passwordFieldModel.value}\n" +
                "${model.searchFieldModel.value}"
    }

    model.textFieldModel.addListener(updateValues)
    model.passwordFieldModel.addListener(updateValues)
    model.searchFieldModel.addListener(updateValues)

    appWindow(
            title = "Data-binding Example #2",
            width = 640,
            height = 480
    ) {
        vbox {
            group("Entries") { stretchy = true }.form {
                textfield(modelEntry = model.textFieldModel) {
                    label = "TextField"
                }

                passwordfield(modelEntry = model.passwordFieldModel) {
                    label = "PasswordField"
                }

                searchfield(modelEntry = model.searchFieldModel) {
                    label = "SearchField"
                }

                values = textarea() {
                    label = "Values"
                    stretchy = true
                }
            }
        }
    }
}
