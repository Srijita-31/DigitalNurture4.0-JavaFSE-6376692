import React from 'react';
import ListPlayers from './ListPlayers';
import IndianPlayers from './IndianPlayers';
import './App.css'; 

function App() {
    const flag = false; // Set to 'true' for ListPlayers, 'false' for IndianPlayers.

    return (
        <div className="App">
            {flag ? (
                <div>
                    <ListPlayers />
                </div>
            ) : (
                <div>
                    <IndianPlayers />
                </div>
            )}
        </div>
    );
}

export default App;