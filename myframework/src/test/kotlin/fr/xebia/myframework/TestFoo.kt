import fr.xebia.myframework.*
import kotlin.test.*

class TestFoo {

    @Test
    fun testBar() {
        assertTrue {
            Foo().bar().startsWith("bar-")
        }
    }
}
