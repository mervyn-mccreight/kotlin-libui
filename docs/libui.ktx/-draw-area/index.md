[libui.ktx](../index.md) / [DrawArea](./index.md)

# DrawArea

`open class DrawArea : `[`Control`](../-control/index.md)`<`[`uiArea`](../../libui/ui-area.md)`>`

Wrapper class for [uiArea](../../libui/ui-area.md) - a canvas you can draw on.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DrawArea(handler: CPointer<`[`ktAreaHandler`](../../libui/kt-area-handler/index.md)`> = nativeHeap.alloc<ktAreaHandler>().ptr, alloc: CPointer<`[`uiArea`](../../libui/ui-area.md)`>? = uiNewArea(handler.pointed.ui.ptr))`<br>Wrapper class for [uiArea](../../libui/ui-area.md) - a canvas you can draw on. |

### Inherited Properties

| Name | Summary |
|---|---|
| [enabled](../-control/enabled.md) | `var enabled: Boolean`<br>Whether the Control should be enabled or disabled. Defaults to `true`. |
| [parent](../-control/parent.md) | `var parent: `[`Control`](../-control/index.md)`<*>?`<br>Returns parent of the control or `null` for detached. |
| [toplevel](../-control/toplevel.md) | `val toplevel: Boolean`<br>Returns whether the control is a top level one or not. |
| [visible](../-control/visible.md) | `var visible: Boolean`<br>Whether the Control should be visible or hidden. Defaults to `true`. |

### Functions

| Name | Summary |
|---|---|
| [dragBroken](drag-broken.md) | `fun dragBroken(block: `[`DrawArea`](./index.md)`.() -> Unit): Unit`<br>Funcion to be run to indicate that a drag should be ended. Only implemented on Windows. Only one function can be registered at a time. |
| [draw](draw.md) | `fun draw(block: `[`DrawContext`](../-draw-context.md)`.(`[`AreaDrawParams`](../-area-draw-params.md)`) -> Unit): Unit`<br>Funcion to be run when the area was created or got resized with [AreaDrawParams](../-area-draw-params.md) as parameter. Only one function can be registered at a time. |
| [keyEvent](key-event.md) | `fun keyEvent(block: `[`DrawArea`](./index.md)`.(event: `[`uiAreaKeyEvent`](../../libui/ui-area-key-event/index.md)`) -> Boolean): Unit`<br>Funcion to be run when a key was pressed. Return `true` to indicate that the key event was handled. (a menu item with that accelerator won't activate, no error sound on macOS). Event is an [uiAreaKeyEvent](../../libui/ui-area-key-event/index.md) Only one function can be registered at a time. |
| [mouseCrossed](mouse-crossed.md) | `fun mouseCrossed(block: `[`DrawArea`](./index.md)`.(left: Boolean) -> Unit): Unit`<br>Funcion to be run when the mouse entered (`left == false`) or left the area. Only one function can be registered at a time. |
| [mouseEvent](mouse-event.md) | `fun mouseEvent(block: `[`DrawArea`](./index.md)`.(`[`AreaMouseEvent`](../-area-mouse-event.md)`) -> Unit): Unit`<br>Funcion to be run when the mouse was moved or clicked over the area with [AreaMouseEvent](../-area-mouse-event.md) as parameter. Only one function can be registered at a time. |
| [redraw](redraw.md) | `fun redraw(): Unit`<br>Queues the entire DrawArea for redraw. The DrawArea is not redrawn before this function returns; it is redrawn when next possible. |

### Inherited Functions

| Name | Summary |
|---|---|
| [disable](../-control/disable.md) | `fun disable(): Unit`<br>Disables the Control. |
| [dispose](../-control/dispose.md) | `open fun dispose(): Unit`<br>Dispose and free all allocated resources. |
| [enable](../-control/enable.md) | `fun enable(): Unit`<br>Enables the Control. |
| [getHandle](../-control/get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [hide](../-control/hide.md) | `fun hide(): Unit`<br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls). |
| [isEnabled](../-control/is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](../-control/is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](../-control/is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [show](../-control/show.md) | `fun show(): Unit`<br>Shows the Control. |

### Extension Functions

| Name | Summary |
|---|---|
| [brush](../../libui.ktx.draw/brush.md) | `fun `[`DrawArea`](./index.md)`.brush(): `[`Brush`](../../libui.ktx.draw/-brush/index.md)<br>Creates a new [Brush](../../libui.ktx.draw/-brush/index.md) with lifecycle delegated to [DrawArea](./index.md). |
| [string](../../libui.ktx.draw/string.md) | `fun `[`DrawArea`](./index.md)`.string(init: String): `[`AttributedString`](../../libui.ktx.draw/-attributed-string/index.md)<br>Creates a new [AttributedString](../../libui.ktx.draw/-attributed-string/index.md) from initial String. The string will be entirely unattributed. |
| [stroke](../../libui.ktx.draw/stroke.md) | `fun `[`DrawArea`](./index.md)`.stroke(block: `[`uiDrawStrokeParams`](../../libui/ui-draw-stroke-params/index.md)`.() -> Unit = {}): `[`Stroke`](../../libui.ktx.draw/-stroke/index.md)<br>Creates a new [Stroke](../../libui.ktx.draw/-stroke/index.md) with lifecycle delegated to [DrawArea](./index.md). |

### Inheritors

| Name | Summary |
|---|---|
| [ScrollingArea](../-scrolling-area/index.md) | `class ScrollingArea : `[`DrawArea`](./index.md)<br>Wrapper class for [uiArea](../../libui/ui-area.md) - a canvas with horziontal and vertical scrollbars. |
