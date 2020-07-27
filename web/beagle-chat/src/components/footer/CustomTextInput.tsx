import React from 'react'

interface TextInput {
    styleId: string,
    placeholder: string  
}

function CustomTextInput(props: TextInput){
    return(
        <input className={props.styleId} placeholder={props.placeholder}></input>
    )
}

export default CustomTextInput
