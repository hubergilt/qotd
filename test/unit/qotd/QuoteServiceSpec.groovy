package qotd

import grails.test.mixin.TestFor
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(QuoteService)
class QuoteServiceSpec extends Specification {

    void "test something"() {
        
        when:
        Quote staticQuote = service.getStaticQuote()

        then:
        staticQuote.author == "Anonymous"
        staticQuote.content == "Real Programmers Don't eat quiche"
        
    }
}
