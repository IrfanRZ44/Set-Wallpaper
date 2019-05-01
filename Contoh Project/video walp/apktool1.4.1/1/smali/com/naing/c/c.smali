.class public final Lcom/naing/c/c;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/app/Activity;ILjava/lang/String;)V
    .locals 1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p0, v0, p1, p2}, Lcom/naing/c/c;->a(Landroid/app/Activity;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private static a(Landroid/app/Activity;Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    invoke-static {p0, p1}, Landroid/support/v4/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/support/v7/app/a$a;

    invoke-direct {v0, p0}, Landroid/support/v7/app/a$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0d003f

    invoke-virtual {v0, v1}, Landroid/support/v7/app/a$a;->a(I)Landroid/support/v7/app/a$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/support/v7/app/a$a;->b(Ljava/lang/CharSequence;)Landroid/support/v7/app/a$a;

    move-result-object v0

    const v1, 0x104000a

    new-instance v2, Lcom/naing/c/c$1;

    invoke-direct {v2, p0, p1, p2}, Lcom/naing/c/c$1;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/app/a$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/a$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/a$a;->c()Landroid/support/v7/app/a;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0, p2}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Lcom/naing/c/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0, p1}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a([I)Z
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    if-lez v1, :cond_0

    aget v1, p0, v0

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
