public record Pelicula(
        String title,
        int episode_id,
        String director,
        String producer,
        String release_date)
{
    @Override
    public String toString() {
        return
                "\nInformación de la película:\n"+
                "* Titulo de la pelicula:'" + title +'\n' +
                "* Numero de episodio: " + episode_id +'\n'+
                "* Nombre del director: " + director + '\n' +
                "* Nombre de la produccion: " + producer + '\n' +
                "* Fecha de lanzamiento: " + release_date + '\n';
    }
}
