.class public Lcom/ccpcreations/android/VLW/FilePicker;
.super Landroid/app/Activity;
.source "FilePicker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final DIALOG_WARNING:I = 0x3e9

.field public static callbackHandler:Landroid/os/Handler;

.field public static callbackRunnable:Ljava/lang/Runnable;

.field public static curDir:Ljava/lang/String;

.field public static filter:[Ljava/lang/String;

.field public static isSelDirectory:Z

.field public static selFile:Ljava/lang/String;


# instance fields
.field ll:Landroid/widget/LinearLayout;

.field sv:Landroid/widget/ScrollView;

.field tvCurrent:Landroid/widget/TextView;

.field view:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 26
    const-string v0, "/sdcard"

    sput-object v0, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    .line 27
    sput-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->selFile:Ljava/lang/String;

    .line 28
    sput-boolean v2, Lcom/ccpcreations/android/VLW/FilePicker;->isSelDirectory:Z

    .line 29
    sput-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->callbackHandler:Landroid/os/Handler;

    .line 30
    sput-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->callbackRunnable:Ljava/lang/Runnable;

    .line 31
    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, ".avi"

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v2, ".mp4"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, ".3gp"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, ".mpg"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, ".flv"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, ".3g2"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, ".asf"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, ".dv"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, ".mov"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    .line 32
    const-string v2, ".mpeg"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, ".rm"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, ".vcd"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, ".vob"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, ".wmv"

    aput-object v2, v0, v1

    .line 31
    sput-object v0, Lcom/ccpcreations/android/VLW/FilePicker;->filter:[Ljava/lang/String;

    .line 24
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 35
    iput-object v0, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    .line 36
    iput-object v0, p0, Lcom/ccpcreations/android/VLW/FilePicker;->sv:Landroid/widget/ScrollView;

    .line 37
    iput-object v0, p0, Lcom/ccpcreations/android/VLW/FilePicker;->tvCurrent:Landroid/widget/TextView;

    .line 24
    return-void
.end method


# virtual methods
.method public callBack()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 189
    sget-object v0, Lcom/ccpcreations/android/VLW/FilePicker;->callbackHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ccpcreations/android/VLW/FilePicker;->callbackRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 190
    sget-object v0, Lcom/ccpcreations/android/VLW/FilePicker;->callbackHandler:Landroid/os/Handler;

    sget-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->callbackRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 191
    :cond_0
    sput-object v2, Lcom/ccpcreations/android/VLW/FilePicker;->callbackHandler:Landroid/os/Handler;

    .line 192
    sput-object v2, Lcom/ccpcreations/android/VLW/FilePicker;->callbackRunnable:Ljava/lang/Runnable;

    .line 193
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6
    .parameter "v"

    .prologue
    .line 197
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    .line 198
    .local v2, tag:Ljava/lang/Object;
    if-nez v2, :cond_3

    .line 199
    const-string v3, "/"

    sget-object v4, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "/sdcard"

    sget-object v5, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    if-nez v3, :cond_0

    const-string v3, "/sdcard/sd"

    sget-object v4, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 200
    :cond_0
    const/16 v3, 0x3e9

    invoke-virtual {p0, v3}, Lcom/ccpcreations/android/VLW/FilePicker;->showDialog(I)V

    .line 219
    :cond_1
    :goto_0
    return-void

    .line 203
    :cond_2
    sget-object v3, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    sput-object v3, Lcom/ccpcreations/android/VLW/FilePicker;->selFile:Ljava/lang/String;

    .line 204
    const/4 v3, 0x1

    sput-boolean v3, Lcom/ccpcreations/android/VLW/FilePicker;->isSelDirectory:Z

    .line 205
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/FilePicker;->callBack()V

    .line 206
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/FilePicker;->finish()V

    goto :goto_0

    .line 207
    :cond_3
    instance-of v3, v2, Ljava/io/File;

    if-eqz v3, :cond_1

    .line 208
    move-object v0, v2

    check-cast v0, Ljava/io/File;

    move-object v1, v0

    .line 209
    .local v1, file:Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 210
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    .line 211
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/FilePicker;->refreshView()V

    goto :goto_0

    .line 212
    :cond_4
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 213
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/ccpcreations/android/VLW/FilePicker;->selFile:Ljava/lang/String;

    .line 214
    const/4 v3, 0x0

    sput-boolean v3, Lcom/ccpcreations/android/VLW/FilePicker;->isSelDirectory:Z

    .line 215
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/FilePicker;->callBack()V

    .line 216
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/FilePicker;->finish()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .parameter "savedInstanceState"

    .prologue
    const/16 v6, 0x14

    const/16 v5, 0xa

    const/4 v3, 0x1

    const/4 v4, -0x1

    .line 41
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    const/4 v1, 0x0

    sput-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->selFile:Ljava/lang/String;

    .line 44
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 45
    .local v0, ll1:Landroid/widget/LinearLayout;
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 46
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    new-instance v1, Landroid/widget/ScrollView;

    invoke-direct {v1, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->sv:Landroid/widget/ScrollView;

    .line 48
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->sv:Landroid/widget/ScrollView;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    .line 50
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 51
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->sv:Landroid/widget/ScrollView;

    iget-object v2, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 53
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->tvCurrent:Landroid/widget/TextView;

    .line 54
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->tvCurrent:Landroid/widget/TextView;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v4, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->tvCurrent:Landroid/widget/TextView;

    invoke-virtual {v1, v5, v6, v5, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 56
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->tvCurrent:Landroid/widget/TextView;

    const v2, -0x777778

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 57
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->tvCurrent:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->tvCurrent:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 59
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/FilePicker;->sv:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 60
    invoke-virtual {p0, v0}, Lcom/ccpcreations/android/VLW/FilePicker;->setContentView(Landroid/view/View;)V

    .line 62
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/FilePicker;->refreshView()V

    .line 63
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 3
    .parameter "id"

    .prologue
    .line 223
    packed-switch p1, :pswitch_data_0

    .line 241
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 225
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 226
    const v1, 0x7f07000d

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 227
    const v1, 0x7f07000e

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 228
    const/high16 v1, 0x7f07

    new-instance v2, Lcom/ccpcreations/android/VLW/FilePicker$3;

    invoke-direct {v2, p0}, Lcom/ccpcreations/android/VLW/FilePicker$3;-><init>(Lcom/ccpcreations/android/VLW/FilePicker;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 237
    const v1, 0x7f070001

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 238
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 223
    nop

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_0
    .end packed-switch
.end method

.method public refreshView()V
    .locals 12

    .prologue
    .line 67
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v8}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 68
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->sv:Landroid/widget/ScrollView;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Landroid/widget/ScrollView;->scrollTo(II)V

    .line 71
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    const/4 v8, -0x1

    const/4 v9, -0x2

    invoke-direct {v4, v8, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 73
    .local v4, lp:Landroid/view/ViewGroup$LayoutParams;
    new-instance v1, Ljava/io/File;

    sget-object v8, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    invoke-direct {v1, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    .local v1, cDir:Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-nez v8, :cond_2

    .line 75
    :cond_0
    const-string v8, "/sdcard"

    sput-object v8, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    .line 76
    new-instance v1, Ljava/io/File;

    .end local v1           #cDir:Ljava/io/File;
    sget-object v8, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    invoke-direct {v1, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 77
    .restart local v1       #cDir:Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-nez v8, :cond_2

    .line 78
    :cond_1
    const-string v8, "/"

    sput-object v8, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    .line 79
    new-instance v1, Ljava/io/File;

    .end local v1           #cDir:Ljava/io/File;
    sget-object v8, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    invoke-direct {v1, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .restart local v1       #cDir:Ljava/io/File;
    :cond_2
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->tvCurrent:Landroid/widget/TextView;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Current directory: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v10, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    .line 86
    .local v5, parent:Ljava/io/File;
    if-eqz v5, :cond_3

    .line 87
    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 88
    .local v0, b:Landroid/widget/Button;
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, ".. <go up to "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ">"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 89
    invoke-virtual {v0, v5}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 90
    invoke-virtual {v0, v4}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    const v8, -0xff0100

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setTextColor(I)V

    .line 93
    const/high16 v8, 0x7f02

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 94
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 97
    .end local v0           #b:Landroid/widget/Button;
    :cond_3
    const/4 v2, 0x0

    check-cast v2, [Ljava/io/File;

    .line 99
    .local v2, files:[Ljava/io/File;
    :try_start_0
    new-instance v8, Lcom/ccpcreations/android/VLW/FilePicker$1;

    invoke-direct {v8, p0}, Lcom/ccpcreations/android/VLW/FilePicker$1;-><init>(Lcom/ccpcreations/android/VLW/FilePicker;)V

    invoke-virtual {v1, v8}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 116
    :goto_0
    if-nez v2, :cond_5

    .line 117
    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 118
    .local v7, tv:Landroid/widget/TextView;
    const-string v8, "Current directory is unreadable!"

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    const/16 v8, 0xff

    const/16 v9, 0xff

    const/16 v10, 0x3f

    const/16 v11, 0x3f

    invoke-static {v8, v9, v10, v11}, Landroid/graphics/Color;->argb(IIII)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 121
    const/high16 v8, -0x100

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 122
    const/16 v8, 0xa

    const/16 v9, 0x1e

    const/16 v10, 0xa

    const/16 v11, 0xa

    invoke-virtual {v7, v8, v9, v10, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 123
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 186
    :cond_4
    return-void

    .line 112
    .end local v7           #tv:Landroid/widget/TextView;
    :catch_0
    move-exception v8

    move-object v6, v8

    .line 113
    .local v6, se:Ljava/lang/SecurityException;
    invoke-virtual {v6}, Ljava/lang/SecurityException;->printStackTrace()V

    .line 114
    const/4 v2, 0x0

    check-cast v2, [Ljava/io/File;

    goto :goto_0

    .line 126
    .end local v6           #se:Ljava/lang/SecurityException;
    :cond_5
    new-instance v8, Lcom/ccpcreations/android/VLW/FilePicker$2;

    invoke-direct {v8, p0}, Lcom/ccpcreations/android/VLW/FilePicker$2;-><init>(Lcom/ccpcreations/android/VLW/FilePicker;)V

    invoke-static {v2, v8}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 132
    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 133
    .restart local v7       #tv:Landroid/widget/TextView;
    const-string v8, "Subdirectories:"

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    const/16 v8, 0xa

    const/4 v9, 0x0

    const/16 v10, 0xa

    const/4 v11, 0x0

    invoke-virtual {v7, v8, v9, v10, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 136
    const/4 v8, -0x1

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 137
    const v8, -0x777778

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 138
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 139
    const/4 v3, 0x0

    .local v3, i:I
    :goto_1
    array-length v8, v2

    if-lt v3, v8, :cond_8

    .line 156
    new-instance v7, Landroid/widget/TextView;

    .end local v7           #tv:Landroid/widget/TextView;
    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 157
    .restart local v7       #tv:Landroid/widget/TextView;
    const-string v8, "Files:"

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 159
    const/16 v8, 0xa

    const/4 v9, 0x0

    const/16 v10, 0xa

    const/4 v11, 0x0

    invoke-virtual {v7, v8, v9, v10, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 160
    const/4 v8, -0x1

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 161
    const v8, -0x777778

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 162
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 163
    const-string v8, "/"

    sget-object v9, Lcom/ccpcreations/android/VLW/FilePicker;->curDir:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    .line 164
    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 165
    .restart local v0       #b:Landroid/widget/Button;
    const-string v8, "<pick the entire directory>"

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 166
    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 167
    invoke-virtual {v0, v4}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    const v8, -0xff0100

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setTextColor(I)V

    .line 170
    const/high16 v8, 0x7f02

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 171
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 174
    .end local v0           #b:Landroid/widget/Button;
    :cond_6
    const/4 v3, 0x0

    :goto_2
    array-length v8, v2

    if-ge v3, v8, :cond_4

    .line 175
    aget-object v8, v2, v3

    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_7

    .line 176
    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 177
    .restart local v0       #b:Landroid/widget/Button;
    aget-object v8, v2, v3

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 178
    aget-object v8, v2, v3

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 179
    invoke-virtual {v0, v4}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 180
    const/4 v8, -0x1

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setTextColor(I)V

    .line 181
    const/high16 v8, 0x7f02

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 182
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 174
    .end local v0           #b:Landroid/widget/Button;
    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 140
    :cond_8
    aget-object v8, v2, v3

    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_9

    .line 141
    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 142
    .restart local v0       #b:Landroid/widget/Button;
    new-instance v8, Ljava/lang/StringBuilder;

    aget-object v9, v2, v3

    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 143
    aget-object v8, v2, v3

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 144
    invoke-virtual {v0, v4}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    aget-object v8, v2, v3

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    const-string v9, "/sdcard"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 146
    const/high16 v8, -0x1

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setTextColor(I)V

    .line 149
    :goto_3
    const/high16 v8, 0x7f02

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 150
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    iget-object v8, p0, Lcom/ccpcreations/android/VLW/FilePicker;->ll:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 139
    .end local v0           #b:Landroid/widget/Button;
    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    .line 148
    .restart local v0       #b:Landroid/widget/Button;
    :cond_a
    const/16 v8, -0x100

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_3
.end method
