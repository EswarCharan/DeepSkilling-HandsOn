import React from 'react';
const offices = [
  { name: 'Tech Park', rent: 5000, address: 'Hyderabad' },
  { name: 'Biz Tower', rent: 6500, address: 'Bangalore' },
  { name: 'Innovate Hub', rent: 8000, address: 'Pune' },
];
function App() {
  const heading=<h1>Office space,At Affordable Range</h1>
  const image="https://static.vecteezy.com/system/resources/previews/040/838/830/non_2x/ai-generated-luxury-office-interior-with-panoramic-window-and-city-view-photo.jpg";

  return (
    <div>
      <center>
        {heading}
        <img src={image} style={{width:"150px",height:"150px",marginBottom:'20px'}}></img>
        {
          offices.map((office,index) =>(
            <div key={index} >
              <h2>Name:{office.name}</h2>
              <p style={{color:office.rent<6000?"red":"green"}}>Rent: ₹{office.rent}</p>
              <p>Address: {office.address}</p>
            </div>
          )
        )
        }
      </center>
    </div>
  );
}

export default App;
