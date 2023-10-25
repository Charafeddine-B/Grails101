

class POI {
    String uname
    String description
    String lng

    static hasMany = [illusrationList: Illusration]
    static belongsTo = [parcoursList: Parcours]

    static constraints = {
        uname  unique: true, nullable: false
        description  blank: false, nullable: false
        lat  nullable: false
        lng   nullable: false
        parcoursList   nullable: false
    }
    static mapping = {
        description type: 'text'

    }
}
