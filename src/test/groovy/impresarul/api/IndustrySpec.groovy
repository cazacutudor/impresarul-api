package impresarul.api

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class IndustrySpec extends Specification implements DomainUnitTest<Industry> {
    void "when name is blank will return error"() {
        when:
            domain.name = null

        then:
            assert !domain.validate(['name'])
            assert domain.errors.hasFieldErrors('name')
    }

    void "when shortName is blank will return error"() {
        when:
            domain.shortName = null

        then:
            assert !domain.validate(['shortName'])
            assert domain.errors.hasFieldErrors('shortName')
    }
}
