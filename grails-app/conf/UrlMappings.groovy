class UrlMappings {
        static mappings = {
		"/"(controller:'discover', view:"index")
                "500"(controller:'discover', view:'error')
                "/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        }
}
