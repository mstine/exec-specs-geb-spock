package com.deepsouthsoftware.execspec.specs

import geb.spock.GebSpec
import com.deepsouthsoftware.execspec.pages.*

class NakedSpec2 extends GebSpec {
	
	String getBaseUrl() {
		"http://localhost:8080"
	}
	
	def "test find speaker flow"() {
		given: "Customer is at the Fluffbox Home Page"
		to HomePage
				
		when: "Customer clicks on 'FIND A SPEAKER'"
		findASpeaker.click(FindASpeakerPage)
		
		and: "Customer clicks on 'Alex Miller'"
		at(FindASpeakerPage)
		
		and: "Customer clicks on 'Find this Speaker'"
		
		and: "Customer clicks on 'RENT NOW'"
		
		and: "Customer clicks on 'Continue'"
		
		and: "Customer enters username, password, and clicks 'Log in'"
		
		then: "If we'd implemented payment, we'd be ready to pay."
	}
}