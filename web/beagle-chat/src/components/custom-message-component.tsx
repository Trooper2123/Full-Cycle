import React from 'react'

interface MessageComponent {
    MyCustomtext : string,
    styleId: string     
}

function CustomMessageComponent(props: MessageComponent){
    return(
        <p className={props.styleId}>{props.MyCustomtext}</p>
    )
}

export default CustomMessageComponent