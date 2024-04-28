Me complace compartir que he completado con éxito el curso de JAVA sobre "Consumo de API, Escritura de Archivos y Manejo de Errores", ofrecido por Alura Latam + Oracle. Durante este curso, desarrollé un proyecto para consumir una API de películas de Star Wars, donde adquirí habilidades fundamentales en programación Java. A continuación, presento un resumen de los principales aspectos aprendidos:

# Consulta de Películas
Para recuperar información detallada sobre una película específica, diseñé un método llamado buscarPelicula en la clase ConsultaPelicula. Utilizando el número de película como parámetro, este método establece una conexión con la API de Star Wars, solicita los datos pertinentes y los convierte en un objeto de tipo Pelicula utilizando la biblioteca Gson. Además, implementé un manejo de errores utilizando try-catch para garantizar una ejecución robusta del programa.

# Clase Pelicula
La clase Pelicula se define como un registro (record) que encapsula los detalles esenciales de una película, incluyendo título, número de episodio, director, productor y fecha de lanzamiento. Esta clase sobrescribe el método toString() para proporcionar una representación textual legible de los objetos Pelicula.

# Generación de Archivos JSON
Utilizando la clase GeneradorDeArchivo, implementé un método para convertir la lista de películas recuperadas en formato JSON y guardarlas en un archivo llamado peliculas.json. Este proceso se lleva a cabo utilizando la biblioteca Gson, asegurando una presentación clara y legible de los datos.

# Interacción con el Usuario
La clase Principal constituye la interfaz principal de la aplicación, donde se solicita al usuario ingresar el número de la película que desea consultar. La aplicación valida la entrada del usuario, realiza la consulta correspondiente a la API y muestra la información de la película solicitada. Además, ofrece la posibilidad de finalizar la consulta o continuar agregando más películas al archivo JSON. Se utiliza la clase Scanner para manejar la entrada de datos por teclado y se emplea un ArrayList para almacenar las películas consultadas.

En resumen, este proyecto no solo me proporcionó una comprensión más profunda de Java y su aplicación en el consumo de APIs, sino que también me permitió desarrollar habilidades prácticas en la gestión de errores y la manipulación de archivos JSON. Estoy entusiasmado por aplicar estos conocimientos en proyectos futuros y seguir explorando el vasto mundo del desarrollo de software con Java.
