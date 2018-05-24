package impresarul.api

import grails.rest.RestfulController

class ImpresarioController extends RestfulController<Impresario> {
	static responseFormats = ['json']

    ImpresarioController() {
        super(Impresario)
    }

	def index() {
		respond Impresario.findAllByIndustry(getIndustry())
	}

	def show(Long id) {
		respond Impresario.findAllByIndustryAndId(getIndustry(), id)
	}

	def save() {
		Impresario instance = new Impresario(industry: getIndustry())
		bindData instance, request

		saveResource instance

		respond(instance, [status:201, formats: ['json']])
	}

	private Industry getIndustry() {
		String industryId = params.industryId
		return Industry.get(industryId)
	}
}
