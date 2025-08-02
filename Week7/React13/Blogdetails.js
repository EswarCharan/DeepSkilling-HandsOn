import React from 'react'

const Blogdetails = () => {
    const blogs = [
        {
            title: "Understanding React Hooks",
        },
        {
            title: "JavaScript ES6 Features",
        },
        {
            title: "CSS Grid vs Flexbox",
        } 
    ]  ;
    const bloglist=blogs.map((blogs,index)=>{
        return(
            <div key={index}>
                <h2>{blogs.title}</h2>
                <p>This is a brief description of the blog post.</p>        
            </div>   
        )
    })
  return (
    <div className="blog">
      <h1>Blog Details</h1>
      <ul>
        {bloglist}
      </ul>
    </div>
  )
}

export default Blogdetails
