
import {PrismaClient} from '@prisma/client'
const prisma = new PrismaClient();

async function main() {
    console.log("Inserting a new user into the database...");
    const user = await prisma.user.create({
        data: {
            firstName: "Emilio",
            lastName: "Resende",
            age: 35
        },
        select: { id: true },
    });
    console.log("Created a new user with id: " + user.id);

    console.log("Loading users from the database...");
    const users = await prisma.user.findMany();
    console.log("Loaded users: ", users);

    console.log(
        "Here you can setup and run express / fastify / any other framework."
    );
}

main()
    .then(() => {
        console.log('exec terminated;');
    })
    .catch((exec) => {
        console.log('exec terminated with problems;', exec);
        process.exitCode = 1;
    })
    .finally(async () => {
        console.log('exec terminated officially;');
        await prisma.$disconnect();
})