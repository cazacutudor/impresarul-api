package impresarul.api

class BootStrap {

    def init = { servletContext ->
        new Industry(name: "Muzica", shortName: "muzica", shortDescription: "Noi suntem muzicieni !", description: "Compania noastra se ocupa inca din anul 1970...")
            .addToImpresarios(
                new Impresario(firstName: "Mihai", lastName: "Zeta", phone: "0722552244", email: "mihaizeta@gmail.com", age: "33")
                    .addToTalents(
                    new Talent(firstName: "Tudor", lastName: "Dan", phone: "0755552244", email: "tudordan@gmail.com", age: "23", gender:"masculin", domain: "muzica", description: "Un bun artist.")
                )
        ).save(flush:true, failOnError: true)

        new Industry(name: "Film", shortName: "film", shortDescription: "Noi suntem actori !", description: "Compania noastra se ocupa inca din anul 1970...")
            .addToImpresarios(
            new Impresario(firstName: "Ion", lastName: "Anton", phone: "0792542244", email: "ionanton@gmail.com", age: "25")
                .addToTalents(
                new Talent(firstName: "Ana", lastName: "Ioana", phone: "0788552244", email: "anaioana@gmail.com", age: "19", gender:"feminin", domain: "teatru", description: "O extraordinara artista.")
            )
        ).save(flush:true, failOnError: true)

        new Industry(name: "Teatru", shortName: "teatru", shortDescription: "Noi suntem actori !", description: "Compania noastra se ocupa inca din anul 1970...")
            .addToImpresarios(
            new Impresario(firstName: "Andreea", lastName: "Maria", phone: "0792542244", email: "andreeamaria@gmail.com", age: "21")
                .addToTalents(
                new Talent(firstName: "Ana", lastName: "Ioana", phone: "0788552244", email: "anaioana@gmail.com", age: "19", gender:"feminin", domain: "teatru", description: "O extraordinara artista.")
            )
        ).save(flush:true, failOnError: true)
    }
    def destroy = {
    }
}
