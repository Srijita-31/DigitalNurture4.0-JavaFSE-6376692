import React from 'react';

const IndianPlayers = () => {
    // a. Destructuring features of ES6
    const allPlayers = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'];
    const [first, second, third, fourth, fifth, sixth] = allPlayers;

    // b. Merge feature of ES6
    const T20Players = ['Mr. First Player', 'Mr. Second Player', 'Mr. Third Player'];
    const RanjiTrophyPlayers = ['Mr. Fourth Player', 'Mr. Fifth Player', 'Mr. Sixth Player'];
    const IndianTeamPlayers = [...T20Players, ...RanjiTrophyPlayers];

    return (
        <div>
            <h2>Odd Players</h2>
            <div>
                <p>First : {allPlayers[0]}</p>
                <p>Third : {allPlayers[2]}</p>
                <p>Fifth : {allPlayers[4]}</p>
            </div>

            <h2>Even Players</h2>
            <div>
                <p>Second : {allPlayers[1]}</p>
                <p>Fourth : {allPlayers[3]}</p>
                <p>Sixth : {allPlayers[5]}</p>
            </div>

            <h2>List of Indian Players Merged:</h2>
            <ul>
                {IndianTeamPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>
        </div>
    );
};

export default IndianPlayers;