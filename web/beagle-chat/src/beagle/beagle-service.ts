import { createBeagleUIService } from '@zup-it/beagle-react'
import CustomLoginComponent from '../components/login/custom-login-component'
import CustomToolbarComponent from '../components/custom-toolbar-component'
import CustomMessageComponent from '../components/custom-message-component'
import CustomMessageInputComponent from '../components/custom-message-input-component'

export default createBeagleUIService<any>({
    baseUrl: "",
    components: {
        //"beagle:container" : PRINCIPAL LOGIN

            //"beagle:container" : CONTENT LOGIN
            "custom:login": CustomLoginComponent,

        //"beagle:container" : PRINCIPAL CHAT
            "custom:toolbar": CustomToolbarComponent,

            //"beagle:container" : CONTENT
            "custom:message": CustomMessageComponent,

            //"beagle:container" : FOOTER
            "custom:messageInput": CustomMessageInputComponent
    }
})