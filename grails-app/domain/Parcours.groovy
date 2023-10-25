

class Parcours {
    String name
    String description


    static hasMany = [poiList: POI, illusrations: Illusration]
    static belongsTo = [author: User]

    static constraints = {
        name blank: false, nullable: false
        description blank: false, nullable: false
        author nullable: false
    }
    static mapping = {
        description type: 'text'

    }
}
