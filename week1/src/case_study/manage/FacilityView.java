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
    private static boolean checkBoolean;

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
                                    if (isBoolean) {
                                        System.out.println("The id already matches another id!!");
                                    }
                                } while (isBoolean);
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
                                    if (isBoolean) {
                                        System.out.println("The id already matches another id!!");
                                    }
                                } while (isBoolean);
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
                                    if (isBoolean) {
                                        System.out.println("The id already matches another id!!");
                                    }
                                } while (isBoolean);
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
                            } while (!isBoolean);
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
                            } while (!isBoolean);
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
                            } while (!isBoolean);
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
                                    checkBoolean = checkYesNo(id);
                                    if (!checkBoolean) {
                                        System.out.println("I cant find id you input!!");
                                    } else {
                                        System.out.println("Successful !!");
                                    }
                                } while (!checkBoolean);
                            }
                            break;
                        case 2:
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                do {
                                    id = inputIdHouse();
                                    checkBoolean = checkYesNo(id);
                                    if (!checkBoolean) {
                                        System.out.println("I cant find id you input!!");
                                    } else {
                                        System.out.println("Successful!!");
                                    }
                                } while (!checkBoolean);
                            }
                            break;
                        case 3:
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                do {
                                    id = inputIdRoom();
                                    checkBoolean = checkYesNo(id);
                                    if (!checkBoolean) {
                                        System.out.println("I cant find id you input!!");
                                    } else {
                                        System.out.println("Successful!!");
                                    }
                                } while (!checkBoolean);
                            }
                            break;
                    }
                    break;
                case 5:
                    facilitys = facilityController.showList();
                    if (facilitys.isEmpty()) {
                        System.out.println("Nothing!!!");
                    } else {
                        Set<Facility> facilityList;
                        do {
                            System.out.println("Input name you want to find!!!");
                            String name = scanner.nextLine();
                            facilityList = facilityController.findName(name);
                            if (facilityList.isEmpty()) {
                                System.out.println("Cant find this name");
                            } else {
                                System.out.println("This is list Facility: ");
                                for (Facility facility1 : facilityList) {
                                    System.out.println(facility1);
                                }
                                break;
                            }
                        } while (true);
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
        String status = EmployeeCondition.checkStatus();
        String standard = EmployeeCondition.checkStandard();
        System.out.println("Input acreage Villa");
        long acreage = EmployeeCondition.checkAcreage();
        System.out.println("Input numberfloor Villa");
        int numberFloor = EmployeeCondition.checkFloor();
        return new Villa(id, name, countPerson, cost, location, status, standard, acreage, numberFloor);
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
        String status = EmployeeCondition.checkStatus();
        String standard = EmployeeCondition.checkStandard();
        System.out.println("Input numberfloor House");
        int numberFloor = EmployeeCondition.checkFloor();
        return new House(id, name, countPerson, cost, location, status, standard, numberFloor);
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
        String status = EmployeeCondition.checkStatus();
        String attachFreeService = attachFreeService();
        return new Room(id, name, countPerson, cost, location, status, attachFreeService);
    }

    private static String inputIdVilla() {
        System.out.println("Input code Vila (SVVL-XXXX)");
        return EmployeeCondition.checkInputVilla();
    }

    private static String inputIdHouse() {
        System.out.println("Input code House (SVHO-XXXX)");
        return EmployeeCondition.checkInputHouse();
    }

    private static String inputIdRoom() {
        System.out.println("Input code Room (SVRO-XXXX)");
        return EmployeeCondition.checkInputRoom();
    }

    private static boolean checkYesNo(String id) {
        while (true) {
            int choice;
            System.out.println("Do you want to delete !!");
            System.out.println("------------------");
            System.out.println("1. Yes \n" +
                    "2. No ");
            choice = EmployeeCondition.checkChoice(1, 2);
            switch (choice) {
                case 1:
                    isBoolean = facilityController.remove(id);
                    return isBoolean;
                case 2:
                    break;
            }
        }
    }
    private static String attachFreeService() {
        int choice;
        do {
            System.out.println("Free Service");
            System.out.println("-----------------");
            System.out.println("1. Free Swimming \n" +
                    "2. Free boating \n" +
                    "3. Free bicyle riding \n" +
                    "4. Free shuttle \n" +
                    "5. Free massage ");
            choice = EmployeeCondition.checkChoice(1, 5);
            switch (choice) {
                case 1:
                    return "Free Swimming";
                case 2:
                    return "Free boating";
                case 3:
                    return "Free bicyle riding";
                case 4:
                    return "Free shuttle";
                case 5:
                    return "Free massage";
            }
        } while (true);
    }
}
