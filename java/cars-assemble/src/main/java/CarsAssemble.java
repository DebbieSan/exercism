public class CarsAssemble {
double productionRate;
int workingItems;

    
    public double productionRatePerHour(int speed){
        productionRate = speed * 221;

    
        if (speed == 10){
            productionRate *= 0.77; 
        }else if(speed == 9){
            productionRate *= 0.80;
        }else if( speed >=5 && speed <=8){
            productionRate *=0.90;

        }

        
            return productionRate;
        }
        
       
    

    public  int workingItemsPerMinute(int speed) {

        return (int) Math.floor(productionRatePerHour(speed)/60.0);


        
        }

    }

