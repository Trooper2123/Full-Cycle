//
//  ChatStyles.swift
//  BeagleChat
//
//  Created by Eduardo Raffi on 27/07/20.
//  Copyright © 2020 Zup. All rights reserved.
//

import Foundation
import UIKit
import Beagle

struct MyCustomComponent: ServerDrivenComponent {
    
    let text: String

    func toView(renderer: BeagleRenderer) -> UIView {
        let label = UILabel(frame: .zero)
        label.text = text
        label.numberOfLines = 0
        label.textColor = .blue
        return label
    }
}
