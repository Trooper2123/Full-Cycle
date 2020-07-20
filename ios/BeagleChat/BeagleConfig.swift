import Beagle
import Foundation

class BeagleConfig {
    static func config() {
        
        let dependencies = BeagleDependencies()
        dependencies.urlBuilder = UrlBuilder(
            baseUrl: URL(string: "URL base do JSON")
        )
        Beagle.dependencies = dependencies
    }
}
