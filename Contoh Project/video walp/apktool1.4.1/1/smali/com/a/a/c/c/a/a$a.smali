.class public Lcom/a/a/c/c/a/a$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/c/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/c/o",
        "<",
        "Lcom/a/a/c/c/g;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/c/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/c/m",
            "<",
            "Lcom/a/a/c/c/g;",
            "Lcom/a/a/c/c/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/a/a/c/c/m;

    const-wide/16 v2, 0x1f4

    invoke-direct {v0, v2, v3}, Lcom/a/a/c/c/m;-><init>(J)V

    iput-object v0, p0, Lcom/a/a/c/c/a/a$a;->a:Lcom/a/a/c/c/m;

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/c/c/r;)Lcom/a/a/c/c/n;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/c/r;",
            ")",
            "Lcom/a/a/c/c/n",
            "<",
            "Lcom/a/a/c/c/g;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/c/c/a/a;

    iget-object v1, p0, Lcom/a/a/c/c/a/a$a;->a:Lcom/a/a/c/c/m;

    invoke-direct {v0, v1}, Lcom/a/a/c/c/a/a;-><init>(Lcom/a/a/c/c/m;)V

    return-object v0
.end method
