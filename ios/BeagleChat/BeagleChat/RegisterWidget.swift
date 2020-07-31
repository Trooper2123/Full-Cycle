//
//  RegisterWidget.swift
//  BeagleChat
//
//  Created by Thomas Almeida on 31/07/20.
//  Copyright © 2020 Zup. All rights reserved.
//

import Foundation
import Beagle

class RegisterWidget {
    init() {
        Beagle.registerCustomComponent("CustomRoundedImageWidget", componentType: CustomRoundedImageWidget.self)
    }
}
