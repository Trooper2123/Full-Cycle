import React from 'react'

interface ToolbarComponent {
    MyCustomtext : string,
    styleId: string        
}

function CustomToolbarComponent(props: ToolbarComponent){
    return(
        <p className={props.styleId}>{props.MyCustomtext}</p>
    )
}

export default CustomToolbarComponent