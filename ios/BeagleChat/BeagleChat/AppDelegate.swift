//
//  AppDelegate.swift
//  BeagleChat
//
//  Created by Eduardo Raffi on 27/07/20.
//  Copyright © 2020 Zup. All rights reserved.
//

import UIKit
import Beagle

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?

    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        
        _ = RegisterWidget()
        
        let beagleScreen = Beagle.screen(.remote(.init(url: "http://localhost:8080/chat")))
        
        self.window = UIWindow(frame: UIScreen.main.bounds)
        self.window?.rootViewController = beagleScreen
        self.window?.makeKeyAndVisible()
        
        return true
    }

}

