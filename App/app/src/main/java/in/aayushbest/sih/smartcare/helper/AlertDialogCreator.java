package in.aayushbest.sih.smartcare.helper;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;

public class AlertDialogCreator extends AlertDialog {

    private String mTitle;
    private String mMessage;
    private Drawable mDialogIcon;
    private Context mCurrentContext;
    private AlertDialog.Builder mDialogBuilder;
    public AlertDialogCreator(Context context){
        super(context);
        setCurrentContext(context);
        mDialogBuilder=new AlertDialog.Builder(getCurrentContext());
    }
    public AlertDialogCreator(Context context,String title,String message){
        super(context);
        mDialogBuilder=new AlertDialog.Builder(getCurrentContext());
        setCurrentContext(context);
        setTitle(title);
        setMessage(message);
    }
    public AlertDialogCreator(Context context,int title,String message){
        super(context);
        setCurrentContext(context);
        setTitle(title);
        setMessage(message);
    }
    public AlertDialogCreator(Context context,String title,int message){
        super(context);
        setCurrentContext(context);
        setTitle(title);
        setMessage(message);
    }
    public AlertDialogCreator(Context context,int titleId,int messageId){
        super(context);
        setCurrentContext(context);
        setTitle(titleId);
        setMessage(messageId);
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setTitle(int titleId){
        mTitle=getCurrentContext().getResources().getString(titleId);
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public void setMessage(int messageResId){
        mMessage=getCurrentContext().getResources().getString(messageResId);
    }

    private Context getCurrentContext() {
        return mCurrentContext;
    }

    private void setCurrentContext(Context currentContext) {
        mCurrentContext = currentContext;
    }


    public Drawable getDialogIcon() {
        return mDialogIcon ;
    }

    public void setDialogIcon(Drawable dialogIcon) {
        mDialogIcon = dialogIcon;
        mDialogBuilder.setIcon(mDialogIcon);
    }

    private Dialog createDialog(){

        mDialogBuilder.setMessage(getTitle());
        mDialogBuilder.setTitle(getMessage());
        return mDialogBuilder.create();
    }

    public void showDialog(){
        AlertDialog  dialog=(AlertDialog)createDialog();
        dialog.show();
    }
}
