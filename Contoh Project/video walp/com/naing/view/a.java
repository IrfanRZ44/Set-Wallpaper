package com.naing.view;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.naing.c.b;

public class a
{
  private Activity a;
  
  public a(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public Dialog a()
  {
    View localView = View.inflate(this.a, 2131361867, null);
    ((CheckBox)localView.findViewById(2131230783)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        b.a(a.a(a.this), paramAnonymousBoolean);
      }
    });
    new AlertDialog.Builder(this.a).setMessage(this.a.getResources().getString(2131558466)).setTitle(this.a.getResources().getString(2131558442)).setIcon(2131492864).setView(localView).setCancelable(true).setPositiveButton(this.a.getResources().getString(2131558465), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
        b.g(a.a(a.this));
        a.a(a.this).finish();
      }
    }).setNegativeButton(this.a.getResources().getString(2131558456), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
        a.a(a.this).finish();
      }
    }).show();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.view.a
 * JD-Core Version:    0.7.0.1
 */