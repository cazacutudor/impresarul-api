package impresarul.api

class Industry {
    Integer id
    String name
    String shortName

    String description
    String shortDescription

    static hasMany = [impresarios: Impresario]

    static constraints = {
        name blank:false
        shortName blank:false, unique:true

        description nullable:true
        shortDescription nullable:true, maxSize:200
    }
}
