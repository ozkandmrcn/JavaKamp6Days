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


function kullaniciVarmi(email,sifre)
{
    for(i=0; i<kullanicilar.length;i++)
    {
        if(kullanicilar[i].email==email && kullanicilar[i].sifre==sifre)
        {
            return true;

        }
    }
    return false;

}

function giris()

{
    if(kullaniciVarmi(email,sifre))
    {
        console.log(tweetler);

    }
    else
    {
        console.log("kullanıcı adı veya sifre hatalı");
    }
}

giris(email,sifre)