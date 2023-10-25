import Grails.UserRole

import javax.management.relation.Role

class User {
    String username
    String email
    String password
    Illusration thumbnail
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this) as List<UserRole>*.role as Set<Role>
    }


    static hasMany = [parcours: Parcours]



    static constraints = {
        username blank: false, unique: true
        email blank: false, unique: true, email: true
        password blank: false, maxSize: 50, minSize: 5, nullable: false , password: true
        thumbnail blank: false, maxSize: 500, minSize: 5, nullable: false

    }
}
