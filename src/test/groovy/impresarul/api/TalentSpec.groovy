package impresarul.api

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TalentSpec extends Specification implements DomainUnitTest<Talent> {
    Talent subject

    void setup() {
        subject = new Talent()
    }

    void "when name is blank will return error"() {
        when:
            domain.name = null

        then:
            assert !domain.validate(['name'])
            assert domain.errors.hasFieldErrors('name')
    }
}
