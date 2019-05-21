package sg.edu.rp.c346.mymodules;

public class Module {
    String moduleCode;
    String moduleName;
    int acadYear;
    int acadSemester;
    int moduuleCredit;
    String venue;

    public Module(String moduleCode, String moduleName, int acadYear, int acadSemester, int moduuleCredit, String venue){
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.acadYear = acadYear;
        this.acadSemester = acadSemester;
        this.moduuleCredit = moduuleCredit;
        this.venue = venue;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getAcadYear() {
        return acadYear;
    }

    public int getAcadSemester() {
        return acadSemester;
    }

    public int getModuuleCredit() {
        return moduuleCredit;
    }

    public String getVenue() {
        return venue;
    }

}
