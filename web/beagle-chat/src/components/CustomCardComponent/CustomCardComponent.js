import React from 'react'
import './CustomCardComponent.less'

function CustomCardComponent(props){
  console.log(props)
    return (
        <p className={props.styleId}>{props.customCard}</p>
    )
}

export default CustomCardComponent;