package impresarul.api

import grails.rest.RestfulController

class IndustryController extends RestfulController<Industry> {
    static responseFormats = ['json']

    IndustryController() {
        super(Industry)
    }
}
