import java.io.File
import java.nio.file.Files
import java.nio.file.Path

class GestionCalificaciones() {
    fun crearDiccionario(rutaArchivo: Path, archivo: File){
        var listaDiccionarios = mutableListOf<MutableMap<String, String>>()
        var Diccionario = mutableMapOf<String, String>()

        Files.newBufferedReader(rutaArchivo).use {
            stream -> stream.forEachLine { line -> Diccionario["Apellidos"] += line.split(";").get(0) }
            println(Diccionario)
        }
    }
}