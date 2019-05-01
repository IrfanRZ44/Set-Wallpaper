.class public Lcom/google/android/gms/common/d;
.super Ljava/lang/Object;


# static fields
.field public static final a:I

.field private static final b:Lcom/google/android/gms/common/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/google/android/gms/common/i;->a:I

    sput v0, Lcom/google/android/gms/common/d;->a:I

    new-instance v0, Lcom/google/android/gms/common/d;

    invoke-direct {v0}, Lcom/google/android/gms/common/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/d;->b:Lcom/google/android/gms/common/d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/common/d;
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/d;->b:Lcom/google/android/gms/common/d;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)I
    .locals 1

    sget v0, Lcom/google/android/gms/common/d;->a:I

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/d;->a(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method

.method public a(Landroid/content/Context;I)I
    .locals 2

    invoke-static {p1, p2}, Lcom/google/android/gms/common/i;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/android/gms/common/i;->c(Landroid/content/Context;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v0, 0x12

    :cond_0
    return v0
.end method

.method public b(Landroid/content/Context;)I
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/i;->d(Landroid/content/Context;)I

    move-result v0

    return v0
.end method
