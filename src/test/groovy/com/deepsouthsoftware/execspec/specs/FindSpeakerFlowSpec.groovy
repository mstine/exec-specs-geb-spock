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
		findASpeaker.click(FindASpeakerPage)
		
		and: "Customer clicks on 'Alex Miller'"
		at FindASpeakerPage
		alexMiller.click(AlexMillerDetailPage)
		
		and: "Customer clicks on 'Find this Speaker'"
		at AlexMillerDetailPage
		findThisSpeaker.click(FindKioskBySpeakerPage)
		
		and: "Customer clicks on 'RENT NOW'"
		at FindKioskBySpeakerPage
		rentNow.click(ReserveSpeakerPage)
		
		and: "Customer clicks on 'Continue'"
		at ReserveSpeakerPage
		continueToSignInOrCreateAccount.click(LoginPage)
		
		and: "Customer enters username, password, and clicks 'Log in'"
		at LoginPage
		loginForm.j_username = "joeuser"
		loginForm.j_password = "password"
		loginButton.click(PaymentPage)
		
		then: 
		at PaymentPage
	}
}