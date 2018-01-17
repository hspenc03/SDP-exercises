class Deque<T> {
    private var head: Element<T>? = null
    fun push(value: T) {
        if (head == null) {
            head = Element(value)
            return
        }
        var current = head
        while(current!!.next != null) {
            current = current.next
        }
        current.next = Element(value, current)

    }

    fun pop(): T? {
        var current = head;
        while(current!!.next != null ) {
            current = current.next
        }
        var result = current.value
        current = current.prev
        current?.next = null
        return result

    }

    fun unshift(value: T) {
        if (head == null) {
            head = Element(value)
            return
        }
        head?.prev = Element(value, null, head)
        head = head?.prev
    }

    fun shift(): T? {
        var current = head;
        var result = head?.value

        head = head?.next
        head?.prev = null
        return result
    }

    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
}