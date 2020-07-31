import { createBeagleUIService } from '@zup-it/beagle-react'
import CustomTextInput from '../components/chat/footer/CustomTextInput'

export default createBeagleUIService<any>({
    baseUrl: "http://localhost:8080",
    components: {
            "custom:customTextInputComponent": CustomTextInput
    }
})