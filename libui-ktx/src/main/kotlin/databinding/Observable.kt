package libui.ktx.databinding

// Function that is being invoked on a value change, getting the new value.
typealias ChangeListener<T> = (T) -> Unit

open class Observable<T> {
    val listeners = mutableSetOf<ChangeListener<T>>()

    fun addListener(listener: ChangeListener<T>) {
        listeners += listener
    }

    fun removeListener(listener: ChangeListener<T>) {
        listeners -= listener
    }

    fun notifyListeners(newValue: T) = listeners.forEach { it(newValue) }
}
