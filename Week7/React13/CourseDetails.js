import React from 'react'

const CourseDetails = () => {
    const courses = [
        {
            title: "Introduction to React",
            duration: "4 weeks",
            price: 200
        },
        {
            title: "Advanced JavaScript",
            duration: "6 weeks",
            price: 300
        },
        {
            title: "Full Stack Development",
            duration: "12 weeks",
            price: 600
        }
    ];  
  return (
    <div className='course'>
      <h1>Course Details</h1>
      <ul>
        {courses.map((course,index)=>{
            return (
                <React.Fragment key={index}>
                <li>Title: {course.title}</li>
                <li>Duration: {course.duration}</li>
                <li>Price: ${course.price}</li>
                <br/>
                </React.Fragment>
            );
        })}
      </ul>
    </div>
  )
}

export default CourseDetails
