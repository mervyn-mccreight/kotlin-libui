import libui.ktx.*
import libui.ktx.databinding.*

fun main(args: Array<String>) {
    class Model {
        val textFieldModel = ModelEntry<String>("TextField")
        val passwordFieldModel = ModelEntry<String>("PasswordField")
        val searchFieldModel = ModelEntry<String>("SearchField")
        val textAreaModel = ModelEntry<String>("TextArea")
    }

    val model = Model()
    lateinit var values: TextArea

    val updateValues: ChangeListener<String> = {
        values.value = "${model.textFieldModel.value}\n" +
                "${model.passwordFieldModel.value}\n" +
                "${model.searchFieldModel.value}\n" +
                "${model.textAreaModel.value}"
    }

    model.textFieldModel.addListener(updateValues)
    model.passwordFieldModel.addListener(updateValues)
    model.searchFieldModel.addListener(updateValues)
    model.textAreaModel.addListener(updateValues)

    appWindow(
            title = "Data-binding Example #2",
            width = 640,
            height = 480
    ) {
        vbox {
            group("Controls") { stretchy = true }.form {
                textfield(modelEntry = model.textFieldModel) {
                    label = "TextField"
                }

                passwordfield(modelEntry = model.passwordFieldModel) {
                    label = "PasswordField"
                }

                searchfield(modelEntry = model.searchFieldModel) {
                    label = "SearchField"
                }
                textarea(modelEntry = model.textAreaModel) {
                    label = "TextArea"
                }
            }
            separator()
            group("Values") { stretchy = true }.form {
                values = textarea() {
                    label = "Values"
                    stretchy = true
                }
            }
        }
    }
}
