

export default class SellingService {

   


    sell(user,game)
    {
        if(user.age<=game.minAge)
        {
            console.log(user.name +  " Yaşı kurtarmıyor." + "En az " + game.minAge + " yaşında olması gerekir" )
            

        }
        else
        {
            console.log( user.name + " kullanıcısı" + game.name + " oyununu satın aldı." )

            
        }
        
    }

    

    
}