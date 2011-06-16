package com.deepsouthsoftware.execspec.specs

import geb.spock.GebSpec
import com.deepsouthsoftware.execspec.pages.*

class NakedSpec3 extends GebSpec {

	String getBaseUrl() {
		"http://localhost:8080"
	}

	def "test find speaker flow"() {
		given: "Customer is at the Fluffbox Home Page"
		to HomePage
		
		when: "Customer clicks on 'FIND A SPEAKER'"
		findASpeaker.click()

		and: "Customer clicks on 'Matt Stine'"
		at FindASpeakerPage
		mattStine.link.click()

		and: "Customer clicks on 'Find this Speaker'"
		at MattStineDetailPage

		and: "Customer clicks on 'RENT NOW'"

		and: "Customer clicks on 'Continue'"

		and: "Customer enters username, password, and clicks 'Log in'"

		then: "If we'd implemented payment, we'd be ready to pay."
	}
}