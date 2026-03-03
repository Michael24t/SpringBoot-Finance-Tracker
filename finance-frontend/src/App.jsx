import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faEnvelope } from '@fortawesome/free-solid-svg-icons'
import { faLinkedin, faGithub } from '@fortawesome/free-brands-svg-icons'


function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div className="social-links">
        <a href="https://github.com/Michael24t" target="_blank" className={"social-link github"}>
            <FontAwesomeIcon icon={faGithub} size="5x" />
        </a>
        <a href="https://www.linkedin.com/in/michael-tumminia111/" target="_blank" className={"social-link linkedin"}>
            <FontAwesomeIcon icon={faLinkedin} bounce style={{color: "rgb(0, 69, 124)",}} size = "5x" />
        </a>
      </div>
      <h1>Finance Tracker</h1>
      <div className="Finance Tracker">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        This is lowkey a test
      </p>
    </>
  )
}

export default App
