package case_study.manage;

import case_study.controller.FacilityController;
import case_study.model.inforFacility.Facility;
import case_study.model.inforFacility.House;
import case_study.model.inforFacility.Room;
import case_study.model.inforFacility.Villa;
import case_study.untils.EmployeeCondition;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilitys;
    private static Facility facility;
    private static Villa villa;
    private static House house;
    private static Room room;
    private static boolean isBoolean;
    private static int count = 0;
    private static final FacilityController facilityController = new FacilityController();
    public static void managementFacility() {
        String id;
        int choice;
        do {
            System.out.println("Facility Management");
            System.out.println("--------------------------");
            System.out.println("1. Display list facility \n" +
                    "2. Add new facility \n" +
                    "3. Edit facility \n" +
                    "4. Delete facility \n" +
                    "5. Search by name facility \n" +
                    "6. Return main menu");
            choice = EmployeeCondition.checkChoice(0, 6);
            switch (choice) {
                case 1:
                    facilitys = facilityController.showList();
                    if (facilitys.isEmpty()) {
                        System.out.println("Nothing is this!!");
                    } else {
                        for (Map.Entry<Facility, Integer> map : facilitys.entrySet()) {
                            System.out.println(map.getKey() + " - " + map.getValue());
                        }
                    }
                    break;
                case 2:
                    System.out.println("1. Add New Villa \n" +
                            "2. Add New House \n" +
                            "3. Add New Room \n" +
                            "4. Back to menu");
                    choice = EmployeeCondition.checkChoice(1, 4);
                    switch (choice) {
                        case 1:
                            facilitys = facilityController.showList();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing is this!!");
                            } else {
                                do {
                                    id = inputIdVilla();
                                    isBoolean = facilityController.findId(id);
                                    if (isBoolean){
                                        System.out.println("The id already matches another id!!");
                                    }
                                }while (isBoolean);
                                facility = inputInforVilla(id);
                                facility.setCode(id);
                                facilityController.addFacility(facility, count);
                                count++;
                                System.out.println("Add completely !!!");
                            }
                            break;
                        case 2:
                            facilitys = facilityController.showList();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing is this!!");
                            } else {
                                do {
                                    id = inputIdHouse();
                                    isBoolean = facilityController.findId(id);
                                    if (isBoolean){
                                        System.out.println("The id already matches another id!!");
                                    }
                                }while (isBoolean);
                                facility = inputInforHouse(id);
                                facility.setCode(id);
                                facilityController.addFacility(facility, count);
                                count++;
                                System.out.println("Add completely !!!");
                            }
                            break;
                        case 3:
                            facilitys = facilityController.showList();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing is this!!");
                            } else {
                                do {
                                    id = inputIdRoom();
                                    isBoolean = facilityController.findId(id);
                                    if (isBoolean){
                                        System.out.println("The id already matches another id!!");
                                    }
                                }while (isBoolean);
                                facility = inputInforRoom(id);
                                facility.setCode(id);
                                facilityController.addFacility(facility, count);
                                count++;
                                System.out.println("Add completely !!!");
                            }
                            break;
                        case 4:
                            System.out.println("See you not again!!");
                            return;
                    }
                    break;
                case 3:
                    facilitys = facilityController.showList();
                    System.out.println("What is you want to edit ??");
                    System.out.println("-----------------------");
                    System.out.println("1. Villa \n" +
                            "2. House \n" +
                            "3. Room ");
                    choice = EmployeeCondition.checkChoice(1, 3);
                    switch (choice) {
                        case 1:
                            do {
                                id = inputIdVilla();
                                isBoolean = facilityController.findId(id);
                                if (!isBoolean) {
                                    System.out.println("Not find id!!");
                                }
                            }while (!isBoolean);
                                villa = inputInforVilla(id);
                                facilityController.editVilla(id, villa);
                                System.out.println("Edit Successful!!!");
                            break;
                        case 2:
                            do {
                                id = inputIdHouse();
                                isBoolean = facilityController.findId(id);
                                if (!isBoolean) {
                                    System.out.println("Not find id!!");
                                }
                            }while (!isBoolean);
                                house = inputInforHouse(id);
                                facilityController.editHouse(id, house);
                                System.out.println("Edit Successful!!!");
                            break;
                        case 3:
                            do {
                                id = inputIdRoom();
                                isBoolean = facilityController.findId(id);
                                if (!isBoolean) {
                                    System.out.println("Not find id!!");
                                }
                            }while (!isBoolean);
                                room = inputInforRoom(id);
                                facilityController.editRoom(id, room);
                                System.out.println("Edit Successful!!!");
                            break;
                    }
                    break;
                case 4:
                    facilitys = facilityController.showList();
                    System.out.println("What is you want to delete ??");
                    System.out.println("-----------------------");
                    System.out.println("1. Villa \n" +
                            "2. House \n" +
                            "3. Room ");
                    choice = EmployeeCondition.checkChoice(1, 3);
                    switch (choice) {
                        case 1:
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                do {
                                    id = inputIdVilla();
                                    isBoolean = facilityController.remove(id);
                                    if (!isBoolean){
                                        System.out.println("I cant find id you input!!");
                                    }
                                }while (!isBoolean);
                                    System.out.println("Succesful!!");
                            }
                            break;
                        case 2:
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                do {
                                    id = inputIdHouse();
                                    isBoolean = facilityController.remove(id);
                                    if (!isBoolean){
                                        System.out.println("I cant find id you input!!");
                                    }
                                }while (!isBoolean);
                                    System.out.println("Succesful!!");
                            }
                            break;
                        case 3:
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                do {
                                    id = inputIdRoom();
                                    isBoolean = facilityController.remove(id);
                                    if (!isBoolean){
                                        System.out.println("I cant find id you input!!");
                                    }
                                }while (!isBoolean);
                                    System.out.println("Succesful!!");
                            }
                            break;
                    }
                    break;
                case 5:
                    facilitys = facilityController.showList();
                    if (facilitys.isEmpty()) {
                        System.out.println("Nothing!!!");
                    } else {
                        System.out.println("Input name you want to find!!!");
                        String name = scanner.nextLine();
                        Set<Facility> facilityList = facilityController.findName(name);

                        if (facilityList.isEmpty()) {
                            System.out.println("Cant find this name");
                        } else {
                            System.out.println("This is list Facility: ");
                            for (Facility facility1 : facilityList) {
                                System.out.println(facility1);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("See you latter!!");
                    return;
            }
        } while (true);
    }

    private static Villa inputInforVilla(String id) {
        System.out.println("Input name Villa");
        String name = EmployeeCondition.checkName();
        System.out.println("Input countPerson Villa");
        int countPerson = EmployeeCondition.checkCountPerson();
        System.out.println("Input cost Villa");
        long cost = EmployeeCondition.checkCost();
        System.out.println("Input location Villa");
        String location = EmployeeCondition.checkString();
        System.out.println("Input status Villa");
        String status = EmployeeCondition.checkStatus();
        System.out.println("Input standar Villa");
        String standar = EmployeeCondition.checkStandard();
        System.out.println("Input acreage Villa");
        long acreage = EmployeeCondition.checkAcreage();
        System.out.println("Input numberfloor Villa");
        int numberfloor = EmployeeCondition.checkFloor();
        return new Villa(id, name, countPerson, cost, location, status, standar, acreage, numberfloor);
    }

    private static House inputInforHouse(String id) {
        System.out.println("Input name House");
        String name = EmployeeCondition.checkName();
        System.out.println("Input countPerson House");
        int countPerson = EmployeeCondition.checkCountPerson();
        System.out.println("Input cost House");
        long cost = EmployeeCondition.checkCost();
        System.out.println("Input location House");
        String location = EmployeeCondition.checkString();
        System.out.println("Input status House");
        String status = EmployeeCondition.checkStatus();
        System.out.println("Input standard House");
        String standard = EmployeeCondition.checkStandard();
        System.out.println("Input numberfloor House");
        int numberfloor = EmployeeCondition.checkFloor();
        return new House(id, name, countPerson, cost, location, status, standard, numberfloor);
    }

    private static Room inputInforRoom(String id) {
        System.out.println("Input name Room");
        String name = EmployeeCondition.checkName();
        System.out.println("Input countPerson Room");
        int countPerson = EmployeeCondition.checkCountPerson();
        System.out.println("Input cost Room");
        long cost = EmployeeCondition.checkCost();
        System.out.println("Input location Room");
        String location = EmployeeCondition.checkString();
        System.out.println("Input status Room");
        String status = EmployeeCondition.checkStatus();
        System.out.println("Input attrachFreeService Room");
        String attrachFreeService = EmployeeCondition.checkString();
        return new Room(id, name, countPerson, cost, location, status, attrachFreeService);
    }

    private static String inputIdVilla() {
        System.out.println("Input code service");
        return EmployeeCondition.checkInputVilla();
    }

    private static String inputIdHouse() {
        System.out.println("Input code service");
        return EmployeeCondition.checkInputHouse();
    }

    private static String inputIdRoom() {
        System.out.println("Input code service");
        return EmployeeCondition.checkInputRoom();
    }
}
