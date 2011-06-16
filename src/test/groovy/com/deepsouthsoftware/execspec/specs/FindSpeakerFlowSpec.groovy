package com.deepsouthsoftware.execspec.specs

import geb.spock.GebSpec
import com.deepsouthsoftware.execspec.pages.*

class FindSpeakerFlowSpec extends GebSpec {
		
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
		findThisSpeaker.link.click()
		
		and: "Customer clicks on 'RENT NOW'"
		at FindKioskBySpeakerPage
		rentNow.link.click()
		
		and: "Customer clicks on 'Continue'"
		at ReserveSpeakerPage
		continueToSignInOrCreateAccount.click()
		
		and: "Customer enters username, password, and clicks 'Log in'"
		at LoginPage
		loginForm.j_username = "joeuser"
		loginForm.j_password = "password"
		loginButton.click()
		
		then: "If we'd implemented payment, we'd be ready to pay."
		at PaymentPage
	}
}