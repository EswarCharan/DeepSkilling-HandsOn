
import React from 'react';
import { useState } from 'react';
import BookDetails from './BookDetails';
import CourseDetails from './CourseDetails';
import Blogdetails from './Blogdetails';  
function App() {
  const [activeTab, setActiveTab] = useState('');
  const [showCourse, setShowCourse] = useState(true);
  const renderComponent=()=>{
    switch(activeTab) {
      case 'course':
        return <CourseDetails />;
      case 'blog':
        return <Blogdetails />;
      case 'book':
        return <BookDetails />;
      default:
        return null;
    } 
    };
    const course=()=>{
      {course? <CourseDetails /> : <p>Course not available</p> }
    }
     return (
    <div className='app'>
      <center>
      <h1 >Blogger App</h1>
      <button onClick={()=> setActiveTab('book') }>Book</button>
      <button onClick={() => { setActiveTab('course'); setShowCourse(true); }}>Course</button>
      <button onClick={()=> setActiveTab('blog') }>Blog</button>
      </center>
      {renderComponent()}
      </div>
  );
}

export default App;
