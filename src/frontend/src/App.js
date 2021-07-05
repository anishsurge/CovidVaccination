import './App.css';
import { UserSignUp } from './pages/UserSignup';
import { Header } from './components/Header';
import { Footer } from './components/Footer';
import { SignUp } from './components/SignUp';

function App() {
  return (
    <div className="App">
      <Header/>
      <SignUp />
      <Footer/>
    </div>
  );
}

export default App;
