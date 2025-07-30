import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 88 },
    { name: 'Rohit Sharma', score: 45 },
    { name: 'KL Rahul', score: 77 },
    { name: 'Shubman Gill', score: 66 },
    { name: 'Hardik Pandya', score: 92 },
    { name: 'Jadeja', score: 55 },
    { name: 'Ashwin', score: 35 },
    { name: 'Bumrah', score: 70 },
    { name: 'Siraj', score: 20 },
    { name: 'Kuldeep', score: 80 },
    { name: 'Iyer', score: 99 }
  ];

  const playerList = players.map((player, index) => (
    <li key={index}>{player.name} - {player.score}</li>
  ));

  const lowScores = players.filter(p => p.score <= 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{playerList}</ul>

      <h3>Players with score below 70</h3>
      <ul>
        {lowScores.map((p, i) => (
          <li key={i}>{p.name} = {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
