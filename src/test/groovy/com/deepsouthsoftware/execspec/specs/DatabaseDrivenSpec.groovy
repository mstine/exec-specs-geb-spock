package com.deepsouthsoftware.execspec.specs

import geb.spock.GebSpec
import com.deepsouthsoftware.execspec.pages.*
import spock.lang.*
import groovy.sql.Sql

class DatabaseDrivenSpec extends GebSpec {
	@Shared sql = Sql.newInstance("jdbc:h2:mem:", "org.h2.Driver")
	
	def setupSpec() {		
		sql.execute("create table speakers (id int primary key, speaker varchar, title varchar)")						
		sql.execute("insert into speakers values (1, 'Craig Walls', 'Author of Spring in Action')")
		sql.execute("insert into speakers values (2, 'Venkat Subramaniam', 'Founder of Agile Developer, Inc.')")
		sql.execute("insert into speakers values (3, 'Brian Sletten', 'Forward Leaning Software Engineer')")
		sql.execute("insert into speakers values (4, 'Nathaniel Schutta', 'Author, speaker, software engineer focused on user interface design.')")
	}
		
	String getBaseUrl() {
		"http://localhost:8080"
	}
	
	def "test find speaker flow"() {
		given: "Customer is at the Fluffbox Home Page"
		to HomePage
		
		when: "Customer clicks on 'FIND A SPEAKER'"
		findASpeaker.click()
		
		and: "Customer clicks on a speaker's name"
		at FindASpeakerPage
		speakerLink(speaker).click()
		
		then: "Customer should see speaker's title"
		speakerTitle == title
		
		where:
		[speaker, title] << sql.rows("select speaker, title from speakers")
		
	}
}