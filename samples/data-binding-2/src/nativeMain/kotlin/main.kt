import libui.ktx.*
import libui.ktx.databinding.ModelEntry

fun main(args: Array<String>) {
    class Model {
        val textFieldModel = ModelEntry("TextField")
        val passwordFieldModel = ModelEntry("PasswordField")
        val searchFieldModel = ModelEntry("SearchField")
        val textAreaModel = ModelEntry("TextArea")
        val checkboxModel = ModelEntry(false)
    }

    val model = Model()
    lateinit var values: TextArea

    val updateValues = {
        values.value = "${model.textFieldModel.value}\n" +
                "${model.passwordFieldModel.value}\n" +
                "${model.searchFieldModel.value}\n" +
                "${model.textAreaModel.value}\n" +
                "${model.checkboxModel.value}"
    }

    model.textFieldModel.addListener { updateValues() }
    model.passwordFieldModel.addListener { updateValues() }
    model.searchFieldModel.addListener { updateValues() }
    model.textAreaModel.addListener { updateValues() }
    model.checkboxModel.addListener { updateValues() }

    appWindow(
            title = "Data-binding Example #2",
            width = 800,
            height = 600
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
                checkbox("Toggle me", modelEntry = model.checkboxModel) {
                    this@form.label = "Checkbox"
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
