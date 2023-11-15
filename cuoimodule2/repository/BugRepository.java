package cuoimodule2.repository;

import cuoimodule2.module.Bug;
import cuoimodule2.until.ReadandFile;
import cuoimodule2.until.Validate;

import java.util.ArrayList;
import java.util.List;

public class BugRepository implements IBugRepository {
    private static List<Bug> bugs = ReadandFile.readFile();

    @Override
    public List<Bug> showList() {
        return bugs;
    }

    @Override
    public boolean findId(String id) {
        for (Bug bug : bugs) {
            if (bug.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addBug(Bug bug) {
        bugs.add(bug);
        ReadandFile.writeFile(bugs);
    }

    public static String dangerous() {
        int choice;
        do {
            System.out.println("Mức độ nguy hại của Bug");
            System.out.println("1. Critical");
            System.out.println("2. Major");
            System.out.println("3. Medium");
            System.out.println("4. Low");
            choice = Validate.checkChoice(1, 4);
            switch (choice) {
                case 1:
                    return "Critical";
                case 2:
                    return "Major";
                case 3:
                    return "Medium";
                case 4:
                    return "Low";
            }
        } while (true);
    }
}
