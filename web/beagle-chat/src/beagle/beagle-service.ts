import { createBeagleUIService } from '@zup-it/beagle-react'
import CustomTextInput from '../components/footer/CustomTextInput'

export default createBeagleUIService<any>({
    baseUrl: "http://localhost:8080",
    components: {
            "custom:customTextInput": CustomTextInput
    }
})