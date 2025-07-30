import React from 'react'

const IndianPlayers = () => {
  const oddTeam = ['Kohli', 'Rahul', 'Hardik', 'Ashwin', 'Kuldeep'];
  const evenTeam = ['Rohit', 'Gill', 'Jadeja', 'Siraj', 'Iyer'];

   const [odd1, odd2, ...oddRest] = oddTeam;
  const [even1, even2, ...evenRest] = evenTeam;

  const T20Players = ['Kohli', 'Rohit', 'Hardik'];
  const RanjiPlayers = ['Jaiswal', 'Pujara', 'Iyer'];

  const allPlayers = [...T20Players, ...RanjiPlayers];
  return (
    <div>
      <h2>Odd Team Players </h2>
      <ul>
         {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players </h2>
       {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
    

      <h3>List Of Indian Players Merged</h3>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers
