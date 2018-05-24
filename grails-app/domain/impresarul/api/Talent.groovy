package impresarul.api

class Talent {
    String name

    static belongsTo = [impresario: Impresario]

    static constraints = {
        name blank:false
    }
}
