package example.com.androidexel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class MainActivity extends ActionBarActivity {

    String path = Environment.getExternalStorageDirectory().getAbsolutePath()+"/test.xls";

    private Button mCanculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCanculator = (Button)findViewById(R.id.button);
        mCanculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CanculateActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });

        Log.e("tuyen.px","tuyen.px : "+path);
        wrileEcel(new File(path));
        ReadExel(new File(path));
    }

    private void wrileEcel(File file){

        WritableWorkbook m_workbook;

       // if(!file.exists())
      //  {
            try
            {
                // Create a cell format for Arial 14 point font
                WritableFont m_arial14font = new WritableFont(WritableFont.ARIAL, 10);
                WritableCellFormat m_arial14format = new WritableCellFormat (m_arial14font);
                m_workbook = Workbook.createWorkbook(file);

                // this will create new new sheet in workbook
                WritableSheet sheet = m_workbook.createSheet("hobbies", 0);

                // this will add label in excel sheet
                Label label = new Label(0, 0, "id", m_arial14format);
                sheet.addCell(label);

                Label label2 = new Label(1, 0, "hobbies", m_arial14format);
                sheet.addCell(label2);

                Label m_idValue = new Label(0,1,"1", m_arial14format);
                sheet.addCell(m_idValue);

                Label m_idValue2 = new Label(1,1,"Music", m_arial14format);
                sheet.addCell(m_idValue2);
                m_workbook.write();
                m_workbook.close();

            }
            catch (Exception e)
            {
                Log.e("tuyen.px","tuyen.px"+e.toString());
            }
      //  }

    }




    private void ReadExel(File file){
        try
        {
            Workbook m_workBook = Workbook.getWorkbook(file);
            //p_sheetNo is excel sheet no which u want to read
            Sheet sheet = m_workBook.getSheet(0);

            for (int j = 1; j< sheet.getRows(); j++)
            {
                for(int k=0 ;k<sheet.getColumns();k++)
                {
                    Cell column1_cell = sheet.getCell(k, j);
                    System.out.println("column1 cell content==== :-&gt; " + column1_cell.getContents());
                }
                continue;
            }
        }
        catch (BiffException e)

        {
            Log.e("tuyen.px","tuyen.px"+e.toString());
            e.printStackTrace();
        }
        catch (IOException e)
        {
            Log.e("tuyen.px","tuyen.px"+e.toString());
            e.printStackTrace();
        }

    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
