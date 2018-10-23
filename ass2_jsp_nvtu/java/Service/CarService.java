package Service;

import java.util.List;

import Dao.CarDao;
import Dao.CarImpl;
import Entity.Car;

public class CarService implements CarServiceImpl {
    private CarImpl carDao;
	@Override
	public List<Car> getAllCar() {
		// TODO Auto-generated method stub
		carDao=new CarDao();
		return carDao.getAllCar();
	}

}
