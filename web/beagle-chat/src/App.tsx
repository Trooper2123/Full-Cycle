import React from 'react';
import './App.css';
import { BeagleProvider, BeagleRemoteView } from '@zup-it/beagle-react';
import BeagleService from './beagle/beagle-service';
import './styles/styles.css'

function App() {
  return (
    <BeagleProvider value={BeagleService}>
      <BeagleRemoteView path={'/payload.json'} />
    </BeagleProvider>
  );
}

export default App;