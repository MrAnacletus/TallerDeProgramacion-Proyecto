object Main{
	def main(args: Array[String]): Unit = {
		// Me lee un archivo :O
		val bufferedSource = io.Source.fromFile("src/dataset.csv")
		for (line <- bufferedSource.getLines) {
			val linea = line.split(",").map(_.trim)				// Por cada linea se leería una medición en scala, con un delay digamos
			println(linea(0) + " " + linea(1) + " " + linea(2))	// de un segundo se podría simular un sensor de movimiento
			Thread.sleep(1000)									// y que se envie un mensaje al brocker
		}
	}
}