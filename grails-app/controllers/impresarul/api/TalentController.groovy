package impresarul.api

import grails.rest.RestfulController

class TalentController extends RestfulController<Talent> {
	static responseFormats = ['json']

	TalentController() {
		super(Talent)
	}

	def index() {
		respond Talent.findAllByImpresario(getImpresario())
	}

	def show(Long id) {
		respond Talent.findAllByImpresarioAndId(getImpresario(), id)
	}

	def save() {
		Talent instance = new Talent(impresario: getImpresario())
		bindData instance, request

		saveResource instance

		respond(instance, [status:201, formats: ['json']])
	}

	private Impresario getImpresario() {
		String impresarioId = params.impresarioId
		return Impresario.get(impresarioId)
	}
}
