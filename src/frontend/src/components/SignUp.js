import { React } from 'react';
import '../../src/App.css';

export const SignUp = () => {
    return (
        <div id="id01" className="modal">
            <form className="modal-content" method="POST" action="http://localhost:8080/covidVaccination/userSignUp">
                <div className="container">
                    <h1>Sign Up</h1>
                    <p>Please fill in this form to create an account.</p>
                    <hr />
                    <label for="email"><b>User Name</b></label>
                    <input type="text" placeholder="Enter User Name" name="userName" required />

                    <label for="email"><b>First Name</b></label>
                    <input type="text" placeholder="Enter First Name" name="firstName" required />

                    <label for="email"><b>Last Name</b></label>
                    <input type="text" placeholder="Enter Last Name" name="lastName" required />

                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="password" required />
                    
                    <div className="clearfix">
                        <button type="button" className="cancelbtn">Cancel</button>
                        <button type="submit" className="signupbtn">Sign Up</button>
                    </div>
                </div>
            </form>
        </div>
    );
}