import org.luart.core.Luart
import java.io.File

fun main(args: Array<String>) {
    val luart = Luart(File(args[0]), args[1])
}