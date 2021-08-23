import { users } from "../data/users.js"
import { DataError } from "../models/dataError.js"

export default class UserService2 {

    constructor() {
        this.customers = []
        this.employees = []
        this.errors = []
    }

    load() {
        for (let user of users) {
            switch (user.type) {
                case "customer":
                    if (this.validateCustomer(user) === false && this.validateAge (user) === false &&this.validateEmail(user) === false) {
                        
                            
                                this.customers.push(user)
                                
                            }
                            break;
                        
                        

                    

                  

                case "employee":
                    if (this.validateCustomer(user) === false) {
                    this.employees.push(user)
                    }
                    break;

                default:
                    this.errors.push(new DataError("invalid data", user))

                    break;
            }

        }

        console.log(this.customers)
        console.log(this.employees)
        console.log(this.errors)

    }

    validateCustomer(user) {
        let requiredFields = ["id", "firstName", "lastName", "age"];
        let hasErrors = false;
        for (let field of requiredFields) {

            if (!user[field]) {
                this.errors.push(new DataError("Geçersiz alan : " + field, user))
                hasErrors = true;
            }

            return hasErrors;



        }
       

    }

    validateEmployee(user) {
        let requiredFields = ["id", "firstName", "lastName", "age"];
        let hasErrors = false;
        for (let field of requiredFields) {

            if (!user[field]) {
                this.errors.push(new DataError("Geçersiz alan : " + field, user))
                hasErrors = true;
            }

            return hasErrors;



        }
     

    }

    validateAge(user){
        let requiredFields = ["age"];
        
        let hasErrors =false;
        
            if(Number.isInteger(user.age)== false || user.age <0){
                this.errors.push(new DataError("YAŞ GEÇERSİZ" , user))
                hasErrors=true;
            }
            return hasErrors;
    }

    validateEmail(user) 
    {
        let hasError = false
        let email = user.eMail
        var re = /^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:.[a-zA-Z0-9-]+)+.(com|org|net|edu|gov|mil|biz|info|mobi)$/;
        if(!email.match(re)){ 
            this.errors.push("Invalid Field: "+ " => ", user)
            hasError = true;
        }
        return hasError;
    }




}