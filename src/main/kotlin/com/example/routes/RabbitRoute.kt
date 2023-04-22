package com.example.routes
import com.example.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.40.37:8100"

private val rabbits = listOf(
    Rabbit("Jennifer", "Jennifer has very pretty eyes.", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Chimi", "Chimi is very wild and energetic. He loves to run when outside.", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Luffy", "Luffy is the quietest among the rabbits and is very shy. When outside he puts his one ear down.", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Sanji and Yonji", "Sanji and yonji are brothers. They are only couple of months old.", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Chopper", "Chopper is the leader of the group.", "$BASE_URL/rabbits/rabbit5.jpg"),
    Rabbit("Conan", "I named it conan because I like to watch Detective Conan.", "$BASE_URL/rabbits/rabbit6.jpg"),
    Rabbit("Jimmi", "Jimmi is the whitest one in the nest.", "$BASE_URL/rabbits/rabbit7.jpg"),
)

fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(
            HttpStatusCode.OK,
            rabbits.random(),
        )
    }
}