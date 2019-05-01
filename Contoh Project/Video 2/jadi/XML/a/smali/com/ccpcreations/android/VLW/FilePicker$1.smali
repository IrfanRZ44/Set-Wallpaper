.class Lcom/ccpcreations/android/VLW/FilePicker$1;
.super Ljava/lang/Object;
.source "FilePicker.java"

# interfaces
.implements Ljava/io/FileFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ccpcreations/android/VLW/FilePicker;->refreshView()V
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
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/FilePicker$1;->this$0:Lcom/ccpcreations/android/VLW/FilePicker;

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 4
    .parameter "pathname"

    .prologue
    const/4 v3, 0x1

    .line 102
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    .line 109
    :goto_0
    return v1

    .line 103
    :cond_0
    sget-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->filter:[Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_0

    .line 105
    :cond_1
    const/4 v0, 0x0

    .local v0, j:I
    :goto_1
    sget-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->filter:[Ljava/lang/String;

    array-length v1, v1

    if-lt v0, v1, :cond_2

    .line 109
    const/4 v1, 0x0

    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/ccpcreations/android/VLW/FilePicker;->filter:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v3

    .line 107
    goto :goto_0

    .line 105
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method
