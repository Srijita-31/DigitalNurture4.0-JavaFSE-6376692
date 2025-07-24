import React from 'react';
import '../Stylesheets/style.css'; 

const percentToDecimal = (decimal) => {
  if (isNaN(decimal) || !isFinite(decimal)) {
    return 'N/A%';
  }
  return (decimal * 100).toFixed(2) + '%';
};

const calcScore = (total, goal) => {
  if (typeof total !== 'number' || typeof goal !== 'number' || goal === 0) {
    
    console.error("Invalid input for calcScore: Total or Goal is not a number or Goal is zero.", { total, goal });
    return 'N/A'; 
  }
  return percentToDecimal(total / goal);
};


const CalculateScore = ({ Name, School, Total, Goal }) => {
  return (
    <div className="formStyle">
      <h1 className="fontColor">Student Details:</h1> {/* */}

      <div className="Name">
        <span className="labelBold">Name: </span> {/* */}
        <span>{Name}</span> {/* */}
      </div>

      <div className="School">
        <span className="labelBold">School: </span> {/* */}
        <span>{School}</span> {/* */}
      </div>

      <div className="Total">
        <span className="labelBold">Total: </span> {/* */}
        <span>{Total}Marks</span> {/* */}
      </div>

      <div className="Score">
        <span className="labelBold">Score: </span> {/* */}
        <span>
          {calcScore(Total, Goal)} {/* */}
        </span>
      </div>
    </div>
  );
};

export default CalculateScore;