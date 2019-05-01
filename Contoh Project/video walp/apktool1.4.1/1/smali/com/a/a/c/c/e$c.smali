.class public final Lcom/a/a/c/c/e$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/c/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/c/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/c/o",
        "<",
        "Ljava/lang/String;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/c/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/c/e$a",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/a/a/c/c/e$c$1;

    invoke-direct {v0, p0}, Lcom/a/a/c/c/e$c$1;-><init>(Lcom/a/a/c/c/e$c;)V

    iput-object v0, p0, Lcom/a/a/c/c/e$c;->a:Lcom/a/a/c/c/e$a;

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
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/c/c/e;

    iget-object v1, p0, Lcom/a/a/c/c/e$c;->a:Lcom/a/a/c/c/e$a;

    invoke-direct {v0, v1}, Lcom/a/a/c/c/e;-><init>(Lcom/a/a/c/c/e$a;)V

    return-object v0
.end method
