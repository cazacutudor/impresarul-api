package impresarul.api

class UrlMappings {

    static mappings = {

        "/api/industries"(resources:'industry', excludes:['create', 'edit']) {
            "/impresarios"(resources:'impresario', excludes:['create', 'edit']) {
                "/talents"(resources:'talent', excludes:['create', 'edit'])
            }
        }

        "/"(view:"/index")
        "/api"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
