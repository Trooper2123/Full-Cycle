package br.com.zup.beagle.chat.bff.components

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class MyCustomComponent(
        val text: String
) : Widget()


# Uncomment the next line to define a global platform for your project
# platform :ios, '9.0'

target 'BeagleTeste' do
# Comment the next line if you don't want to use dynamic frameworks
use_frameworks!

# Pods for BeagleTeste

pod 'Beagle'
pod 'YogaKit', :git => 'https://github.com/lucasaraujo/yoga.git'

end
