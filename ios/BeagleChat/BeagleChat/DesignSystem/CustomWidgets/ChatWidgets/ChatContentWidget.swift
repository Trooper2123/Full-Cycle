//
//  ChatContentWidget.swift
//  BeagleChat
//
//  Created by Eduardo Raffi on 27/07/20.
//  Copyright © 2020 Zup. All rights reserved.
//

import Foundation
import Beagle
import BeagleSchema

struct CustomRoundedImageWidget: ServerDrivenComponent, RawWidget, Decodable {
    
    enum CodingKeys: String, CodingKey {
        case widgetProperties
        case imagePath
        case cornerRadius
        case size
    }
    
    var widgetProperties: WidgetProperties
    var imagePath: String?
    var cornerRadius: CornerRadius?
    var size: Size?
    
    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        
        widgetProperties = try WidgetProperties(from: decoder)
        imagePath = try container.decodeIfPresent(String.self, forKey: .imagePath)
        cornerRadius = try container.decodeIfPresent(CornerRadius.self, forKey: .cornerRadius)
        size = try container.decodeIfPresent(Size.self, forKey: .size)
    }
    
    func toView(renderer: BeagleRenderer) -> UIView {
        let image = UIImageView()
        image.image = .checkmark
        if let radius = cornerRadius?.radius {
            image.layer.cornerRadius = CGFloat(radius)
        }
        return image
    }
}
