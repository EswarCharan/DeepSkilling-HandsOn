import React from 'react'

const BookDetails = () => {
    const books=[
        {
           name: "The Great Gatsby",
           price:670
         },
         {
         name: "1984",
         price: 500
         },
         {name: "Pride and Prejudice",
         price: 450        
         }
        ]
    const list = books.map((book, index) => (
      <React.Fragment key={index}>
        <li>name:{book.name}</li>
        <li>price:{book.price}</li>
        <br/>
      </React.Fragment>
    ));
  return (
    <div className='book'>
      <h1>Book Details</h1>
      <ul>
        {list}
      </ul>
    </div>
  )
}

export default BookDetails
