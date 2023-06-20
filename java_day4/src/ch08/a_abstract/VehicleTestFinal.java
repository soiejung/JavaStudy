package ch08.a_abstract;

import ch08.a_abstract.bad.DieselSUV;
import ch08.a_abstract.bad.ElectricCar;
import ch08.a_abstract.bad.HorseCart;
import ch08.a_abstract.bad.Vehicle;

// TODO: DieselSUV와 ElectricCar의 공통 모듈을 가지는 Vehicle을 정의하시오.

// END

// TODO: Vehicle을 상속받는 DieselSUV와 ElecCar를 구현하시오.

// END

// TODO: Vehicle을 상속받는 HorseCart를 구현하시오.

// END

public class VehicleTestFinal {

    public static void main(String[] args) {
        // TODO: DieselSUV와 ElectricCar를 관리하는 배열을 구성하고 연료 주입, 현재 위치를 출력하시오.
    	Vehicle [] vehicles = { new ElectricCar(), new DieselSUV(), new HorseCart()};
    	for(Vehicle v : vehicles) {
    		v.addFuel();
    		v.reportPosition();
    	}
    	Vehicle v = new ElectricCar();

        // END
    }
}
