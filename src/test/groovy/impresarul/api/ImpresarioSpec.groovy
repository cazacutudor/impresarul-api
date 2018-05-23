package impresarul.api

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ImpresarioSpec extends Specification implements DomainUnitTest<Impresario> {
    Impresario subject

    void setup() {
        subject = new Impresario()
    }

    void "Impresario - when name is blank will return error"() {
        when:
            domain.name = null

        then:
            assert !domain.validate(['name'])
            assert domain.errors.hasFieldErrors('name')
    }
}
