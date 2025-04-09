package EmployeeManagement;

class RobotBrand extends RobotEmployee{

    @Override
    public void charging(String brandName) {
        System.out.println(brandName+" bots can charge with high speeed mode.");
    }
}

class RobotBrand2 extends RobotEmployee{

    @Override
    public void charging(String brandName) {
        System.out.println(brandName+" bots can charge with Low speeed mode only.");
    }
}
