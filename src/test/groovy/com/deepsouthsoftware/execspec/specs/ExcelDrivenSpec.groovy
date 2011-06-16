package com.deepsouthsoftware.execspec.specs

import geb.spock.GebSpec
import com.deepsouthsoftware.execspec.pages.*
import spock.lang.*
import org.apache.poi.ss.usermodel.*
import org.apache.poi.hssf.usermodel.HSSFWorkbook

class ExcelDrivenSpec extends GebSpec {
	@Shared dataSet = []
	
	def setupSpec() {
		def excelInputStream = getClass().getResourceAsStream("/DataDrivenSpec.xls")
		def wb = new HSSFWorkbook(excelInputStream)
		def sheet = wb.getSheetAt(0)
				
		sheet.rowIterator().each { row ->
			def dataSetRow = []
			
			dataSetRow << row.getCell(0).stringCellValue
			dataSetRow << row.getCell(1).stringCellValue
			
			dataSet << dataSetRow
		}
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
		[speaker, title] << dataSet
	}
}