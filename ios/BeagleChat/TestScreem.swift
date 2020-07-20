//
//  TestScreem.swift
//  BeagleTeste
//
//  Created by Thomas Almeida on 09/07/20.
//  Copyright © 2020 Thomas Almeida. All rights reserved.
//

import Foundation
import Beagle
import BeagleSchema

class TestScreen {

 func testScreen() -> Screen {
        return Screen(
            
        child: Container(
            children: [
                Text(
                    "Hello Beagle",
                    
                    alignment: .value(.center),
                    
                    widgetProperties: WidgetProperties(
                            style: Style(
                                margin: EdgeValue().top(16)
                            )
                        )
                ),
                Text(
                    """
                    Beagle is a cross-platform framework which provides usage of the
                    Server-Driven UI concept, natively in iOS, Android and Web applications.
                    By using Beagle, your team could easily change application's layout and
                    data by just changing backend code.
                    """,
                    alignment: .none,
                    widgetProperties: WidgetProperties(
                            style: Style(
                                margin: EdgeValue().horizontal(16).top(20)
                            )

                        )
                )
            ]
        )
        )
    }
}
