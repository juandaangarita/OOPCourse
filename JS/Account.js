class Account{
    constructor(name, document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }
}

Account.prototype.printDataAccount = function(){
    console.log(this.name)
    console.log(this.document)
    console.log(this.email)
}