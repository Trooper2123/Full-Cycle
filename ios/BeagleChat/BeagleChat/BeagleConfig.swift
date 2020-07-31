//
//  BeagleConfig.swift
//  BeagleChat
//
//  Created by Thomas Almeida on 31/07/20.
//  Copyright © 2020 Zup. All rights reserved.
//

import Beagle
import Foundation

class BeagleConfig {
    static func config() {
        
        let dependencies = BeagleDependencies()
        dependencies.urlBuilder = UrlBuilder(
            baseUrl: URL(string: "http://localhost")
        )
        Beagle.dependencies = dependencies
    }
}
