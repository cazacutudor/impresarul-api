package impresarul.api

class BootStrap {

    def init = { servletContext ->
        new Industry(name: "Music", shortName: "music")
            .addToImpresarios(
                new Impresario(name: "Impresarul Gigi")
                    .addToTalents(
                        new Talent(name: "Talent Gigi")
                )
        ).save(flush:true, failOnError: true)

        new Industry(name: "Movie", shortName: "movie")
            .addToImpresarios(
            new Impresario(name: "Impresarul Gigi")
                .addToTalents(
                new Talent(name: "Talent Gigi")
            )
        ).save(flush:true, failOnError: true)
    }
    def destroy = {
    }
}
