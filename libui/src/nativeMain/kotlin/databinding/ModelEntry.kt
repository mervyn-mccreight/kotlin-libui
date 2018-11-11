package libui.ktx.databinding

import kotlin.properties.Delegates.observable

class ModelEntry<T>(initialValue: T) : Observable<T>() {
    var value: T by observable(initialValue) {_, _, newValue ->
        notifyListeners(newValue)
    }

    fun get(): T = value

    fun update(newValue: T) {
        this.value = newValue
    }
}
