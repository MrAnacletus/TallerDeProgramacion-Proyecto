object Main {
	def main(args: Array[String]): Unit = {
		// recibe un uno o un 0
		// si recibe un uno abre la puerta
		// este comportamiento se verá reflejado con un log
		// si pasan 3 segundos se cierra la puerta

		// se recibe desde activeMQ (por ahora se simula con random)
		var tiempo:Int = 0
		val r = scala.util.Random
		var binario:Int = 0
		while(true){
			binario = r.nextInt(1)
			println(s"el binario es {binario}")
			if (binario == 1) {
				println("Se abre la puerta")
			}
			if (tiempo == 3){
				println("Se cierra la puerta")
			}
			tiempo += 1
			Thread.sleep(1000)
		}
	}
}
