package qotd

import grails.test.mixin.TestFor
import grails.test.spock.IntegrationSpec

@TestFor(QuoteService)
class QuoteServiceIntegrationSpec extends IntegrationSpec {

    void "test something"() {
        when:
        Quote staticQuote = service.getStaticQuote()

        then:
        staticQuote.author == "Anonymous"
        staticQuote.content == "Real Programmers Don't eat quiche"        
    }
}
