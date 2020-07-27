import React from 'react'

interface MessageInputComponent {
    MyCustomtext : string,
    styleId: string        
}

function CustomMessageInputComponent(props : MessageInputComponent){
    return(
        <p className={props.styleId}>{props.MyCustomtext}</p>
    )
}

export default CustomMessageInputComponent