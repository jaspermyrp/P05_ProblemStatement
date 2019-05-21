package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView moduleCode, moduleName, moduleYear, moduleSemester, moduleCredits, moduleVenue;
    Button exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        moduleCode = findViewById(R.id.moduleCode);
        moduleName = findViewById(R.id.moduleName);
        moduleYear = findViewById(R.id.moduleYear);
        moduleSemester = findViewById(R.id.moduleSemester);
        moduleCredits = findViewById(R.id.moduleCredit);
        moduleVenue = findViewById(R.id.moduleVenue);

        exitBtn = findViewById(R.id.closeBtn);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        Intent getIntent = getIntent();
        String modCode = getIntent.getStringExtra("ModuleCode");

        // Create fake data //
        ArrayList<Module> moduleList = new ArrayList<Module>();

        Module c346 = new Module("C346", "Android Programming", 2018, 1, 4, "W66M");
        Module c349 = new Module("C349", "iPad Programming", 2018, 1, 4, "W66J");

        moduleList.add(c346);
        moduleList.add(c349);

        for (Module m : moduleList) {
            if (m.getModuleCode().equals(modCode)) {
                moduleCode.setText("Module Code: "+m.getModuleCode());
                moduleName.setText("Module Name: "+m.getModuleName());
                moduleYear.setText("Academic Year: "+m.getAcadYear() + "");
                moduleSemester.setText("Semester: "+m.getAcadSemester() + "");
                moduleCredits.setText("Module Credit: "+m.getModuuleCredit() + "");
                moduleVenue.setText("Venue: "+m.getVenue());
                break;
            }
        }

    }
}
