-- Constraint: Lokatorzy_Nazwisko_key

-- ALTER TABLE IF EXISTS public."Lokatorzy" DROP CONSTRAINT IF EXISTS "Lokatorzy_Nazwisko_key";

ALTER TABLE IF EXISTS public."Lokatorzy"
    ADD CONSTRAINT "Lokatorzy_Nazwisko_key" UNIQUE ("Nazwisko");
