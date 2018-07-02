package impresarul.api

import grails.rest.RestfulController

class TalentController extends RestfulController<Talent> {
	static responseFormats = ['json']

	TalentController() {
		super(Talent)
	}
}
