package grails.tp1

import Grails.Role
import Grails.User
import Grails.UserRole

class BootStrap {

    def init = { servletContext ->
        def roleAdmin = new Role(authority: 'ROLE_ADMIN').save()
        def roleUser = new Role(authority: 'ROLE_USER').save()
        defuserADmin = new User(username: 'admin', password: 'admin', enabled: true).save()
        UserRole.create(userAdmin, roleAdmin, true)
        ["charaf","belyazid","charley"].each {
            String uName ->
                def userInstance = new User(username: uName, password: 'password', enabled: true).save()
        }
    }
    def destroy = {
    }
}
