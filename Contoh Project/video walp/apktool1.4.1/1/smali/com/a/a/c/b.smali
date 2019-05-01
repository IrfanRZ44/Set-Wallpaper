.class public final enum Lcom/a/a/c/b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/a/a/c/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/a/a/c/b;

.field public static final enum b:Lcom/a/a/c/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum c:Lcom/a/a/c/b;

.field public static final d:Lcom/a/a/c/b;

.field private static final synthetic e:[Lcom/a/a/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/a/a/c/b;

    const-string v1, "PREFER_ARGB_8888"

    invoke-direct {v0, v1, v2}, Lcom/a/a/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/a/a/c/b;->a:Lcom/a/a/c/b;

    new-instance v0, Lcom/a/a/c/b;

    const-string v1, "PREFER_ARGB_8888_DISALLOW_HARDWARE"

    invoke-direct {v0, v1, v3}, Lcom/a/a/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/a/a/c/b;->b:Lcom/a/a/c/b;

    new-instance v0, Lcom/a/a/c/b;

    const-string v1, "PREFER_RGB_565"

    invoke-direct {v0, v1, v4}, Lcom/a/a/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/a/a/c/b;->c:Lcom/a/a/c/b;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/a/a/c/b;

    sget-object v1, Lcom/a/a/c/b;->a:Lcom/a/a/c/b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/a/a/c/b;->b:Lcom/a/a/c/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/a/a/c/b;->c:Lcom/a/a/c/b;

    aput-object v1, v0, v4

    sput-object v0, Lcom/a/a/c/b;->e:[Lcom/a/a/c/b;

    sget-object v0, Lcom/a/a/c/b;->b:Lcom/a/a/c/b;

    sput-object v0, Lcom/a/a/c/b;->d:Lcom/a/a/c/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/a/a/c/b;
    .locals 1

    const-class v0, Lcom/a/a/c/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/b;

    return-object v0
.end method

.method public static values()[Lcom/a/a/c/b;
    .locals 1

    sget-object v0, Lcom/a/a/c/b;->e:[Lcom/a/a/c/b;

    invoke-virtual {v0}, [Lcom/a/a/c/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/a/a/c/b;

    return-object v0
.end method
