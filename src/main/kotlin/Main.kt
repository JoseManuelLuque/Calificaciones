import java.io.File
import java.nio.file.Path

fun main() {
    val rutaFichero = Path.of("src").resolve("main").resolve("resources").resolve("calificaciones.csv")
    val fichero = File("src/main/resources/calificaciones.csv")
    GestionCalificaciones().crearDiccionario(rutaFichero, fichero)
}