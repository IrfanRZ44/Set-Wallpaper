.class public Lcom/a/a/g/b/a$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/g/b/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/g/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/a/a/g/b/c",
        "<TR;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/c/a;Z)Lcom/a/a/g/b/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/a;",
            "Z)",
            "Lcom/a/a/g/b/b",
            "<TR;>;"
        }
    .end annotation

    sget-object v0, Lcom/a/a/g/b/a;->a:Lcom/a/a/g/b/a;

    return-object v0
.end method
