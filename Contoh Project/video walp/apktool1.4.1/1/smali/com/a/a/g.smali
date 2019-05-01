.class public final enum Lcom/a/a/g;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/a/a/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/a/a/g;

.field public static final enum b:Lcom/a/a/g;

.field public static final enum c:Lcom/a/a/g;

.field public static final enum d:Lcom/a/a/g;

.field private static final synthetic e:[Lcom/a/a/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/a/a/g;

    const-string v1, "IMMEDIATE"

    invoke-direct {v0, v1, v2}, Lcom/a/a/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/a/a/g;->a:Lcom/a/a/g;

    new-instance v0, Lcom/a/a/g;

    const-string v1, "HIGH"

    invoke-direct {v0, v1, v3}, Lcom/a/a/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/a/a/g;->b:Lcom/a/a/g;

    new-instance v0, Lcom/a/a/g;

    const-string v1, "NORMAL"

    invoke-direct {v0, v1, v4}, Lcom/a/a/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/a/a/g;->c:Lcom/a/a/g;

    new-instance v0, Lcom/a/a/g;

    const-string v1, "LOW"

    invoke-direct {v0, v1, v5}, Lcom/a/a/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/a/a/g;->d:Lcom/a/a/g;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/a/a/g;

    sget-object v1, Lcom/a/a/g;->a:Lcom/a/a/g;

    aput-object v1, v0, v2

    sget-object v1, Lcom/a/a/g;->b:Lcom/a/a/g;

    aput-object v1, v0, v3

    sget-object v1, Lcom/a/a/g;->c:Lcom/a/a/g;

    aput-object v1, v0, v4

    sget-object v1, Lcom/a/a/g;->d:Lcom/a/a/g;

    aput-object v1, v0, v5

    sput-object v0, Lcom/a/a/g;->e:[Lcom/a/a/g;

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

.method public static valueOf(Ljava/lang/String;)Lcom/a/a/g;
    .locals 1

    const-class v0, Lcom/a/a/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/a/a/g;

    return-object v0
.end method

.method public static values()[Lcom/a/a/g;
    .locals 1

    sget-object v0, Lcom/a/a/g;->e:[Lcom/a/a/g;

    invoke-virtual {v0}, [Lcom/a/a/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/a/a/g;

    return-object v0
.end method
