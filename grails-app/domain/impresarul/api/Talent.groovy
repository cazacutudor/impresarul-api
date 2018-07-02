package impresarul.api

class Talent {
    String firstName
    String lastName
    String phone
    String email
    String age
    String domain
    String gender
    String description


    static belongsTo = [impresario: Impresario]
}
