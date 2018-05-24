package impresarul.api

class Impresario {
    String name

    static belongsTo = [industry: Industry]
    static hasMany = [talents: Talent]

    static constraints = {
        name blank:false
    }
}
