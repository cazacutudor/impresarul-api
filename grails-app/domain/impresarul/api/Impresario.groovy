package impresarul.api

class Impresario {
    String firstName
    String lastName
    String phone
    String email
    String age
    String domain

    static belongsTo = [industry: Industry]
    static hasMany = [talents: Talent]
}
