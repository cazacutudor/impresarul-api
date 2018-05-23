package impresarul.api

import grails.rest.RestfulController

class ImpresarioController extends RestfulController<Impresario> {
	static responseFormats = ['json']

    ImpresarioController() {
        super(Impresario)
    }
}
