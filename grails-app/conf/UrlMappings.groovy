class UrlMappings {
        static mappings = {
		"/"(controller:'home', view:"index")
                "500"(controller:'home', view:'error')
                "/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        }
}
