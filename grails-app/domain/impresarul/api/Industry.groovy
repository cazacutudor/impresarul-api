package impresarul.api

class Industry {
    Integer id
    String name
    String shortName

    String description
    String shortDescription

    static hasMany = [impresarios: Impresario]
}
