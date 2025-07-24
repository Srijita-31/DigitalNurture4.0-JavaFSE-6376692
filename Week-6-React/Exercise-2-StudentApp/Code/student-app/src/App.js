import './App.css'; // This line is correct and necessary for styling
// Remove this line if it exists: import logo from './logo.svg';

// Import your new components (these lines are correct)
import Home from './Components/Home';
import About from './Components/About';
import Contact from './Components/Contact';

function App() {
  return (
    
    <div className="container">
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;