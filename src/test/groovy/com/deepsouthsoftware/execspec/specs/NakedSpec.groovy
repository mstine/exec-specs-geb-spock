package com.deepsouthsoftware.execspec.specs

import spock.lang.Specification

class NakedSpec extends Specification {
	
	def "test find speaker flow"() {
		given: "Customer is at the Fluffbox Home Page"
				
		when: "Customer clicks on 'FIND A SPEAKER'"
		
		and: "Customer clicks on 'Alex Miller'"
		
		and: "Customer clicks on 'Find this Speaker'"
		
		and: "Customer clicks on 'RENT NOW'"
		
		and: "Customer clicks on 'Continue'"
		
		and: "Customer enters username, password, and clicks 'Log in'"
		
		then: "If we'd implemented payment, we'd be ready to pay."
	}
}