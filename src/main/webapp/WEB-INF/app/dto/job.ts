
export class Job{
    
    id : number;
    firstName : string; 
    lastName : string;
    birthDate: Date;
    
    constructor( id : number, 
                 firstName : string,
                 lastName : string, 
                 birthDate: Date ){
                     
        this.id = id;
        this.firstName = firstName;    
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    
}