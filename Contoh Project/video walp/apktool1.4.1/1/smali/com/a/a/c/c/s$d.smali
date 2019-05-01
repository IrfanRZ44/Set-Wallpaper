.class public Lcom/a/a/c/c/s$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/c/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/c/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/c/o",
        "<",
        "Ljava/lang/Integer;",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/c/c/s$d;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/c/c/r;)Lcom/a/a/c/c/n;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/c/r;",
            ")",
            "Lcom/a/a/c/c/n",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/c/c/s;

    iget-object v1, p0, Lcom/a/a/c/c/s$d;->a:Landroid/content/res/Resources;

    invoke-static {}, Lcom/a/a/c/c/v;->a()Lcom/a/a/c/c/v;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/a/a/c/c/s;-><init>(Landroid/content/res/Resources;Lcom/a/a/c/c/n;)V

    return-object v0
.end method
