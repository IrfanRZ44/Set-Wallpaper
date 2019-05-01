.class Lcom/ccpcreations/android/VLW/FilePicker$3;
.super Ljava/lang/Object;
.source "FilePicker.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ccpcreations/android/VLW/FilePicker;->onCreateDialog(I)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ccpcreations/android/VLW/FilePicker;


# direct methods
.method constructor <init>(Lcom/ccpcreations/android/VLW/FilePicker;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/FilePicker$3;->this$0:Lcom/ccpcreations/android/VLW/FilePicker;

    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .parameter "dialog"
    .parameter "which"

    .prologue
    .line 231
    sget-object v0, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    sput-object v0, Lcom/ccpcreations/android/VLW/FilePicker;->selFile:Ljava/lang/String;

    .line 232
    const/4 v0, 0x1

    sput-boolean v0, Lcom/ccpcreations/android/VLW/FilePicker;->isSelDirectory:Z

    .line 233
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/FilePicker$3;->this$0:Lcom/ccpcreations/android/VLW/FilePicker;

    invoke-virtual {v0}, Lcom/ccpcreations/android/VLW/FilePicker;->callBack()V

    .line 234
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/FilePicker$3;->this$0:Lcom/ccpcreations/android/VLW/FilePicker;

    invoke-virtual {v0}, Lcom/ccpcreations/android/VLW/FilePicker;->finish()V

    .line 235
    return-void
.end method
