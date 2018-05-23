package impresarul.api

class BootStrap {

    def init = { servletContext ->
        new Impresario(name: "Impresarul Gigi").save()
    }
    def destroy = {
    }
}
