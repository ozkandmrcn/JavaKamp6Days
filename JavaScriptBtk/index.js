var kullanicilar=[

    {
        email:"ozkandemircan@gmail.com",sifre:"12345"
    },

    {
        email:"betuldemircan@gmail.com",sifre:"12345"
    }

]

var tweetler=[
    {
        email:"ozkandemircan@gmail.com",tweet:"Bugün hava güzel"
    },
    {
        email:"ozkandemircan@gmail.com",tweet:"Bugün hava güzel2"
    },
    {
        email:"betuldemircan@gmail.com",tweet:"Bugün hava güzel3"
    }

]

var email =prompt("email?")
var sifre =prompt("sifre?")


function giris()

{
    if((email==kullanicilar[0].email && sifre ==kullanicilar[0].sifre) ||
     (email==kullanicilar[1].email && sifre ==kullanicilar[1].sifre))
    {
        console.log(tweetler);

    }
    else
    {
        console.log("kullanıcı adı veya sifre hatalı");
    }
}

giris(email,sifre)