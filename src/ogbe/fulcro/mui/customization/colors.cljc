(ns ogbe.fulcro.mui.customization.colors
  #?(:cljs (:require
            ["@mui/material/colors" :as colors]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn amber
  ([] #?(:cljs colors/amber))
  ([shade] #?(:cljs (gobj/get colors/amber shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn blue
  ([] #?(:cljs colors/blue))
  ([shade] #?(:cljs (gobj/get colors/blue shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn blue-grey
  ([] #?(:cljs colors/blueGrey))
  ([shade] #?(:cljs (gobj/get colors/blueGrey shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn brown
  ([] #?(:cljs colors/brown))
  ([shade] #?(:cljs (gobj/get colors/brown shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn cyan
  ([] #?(:cljs colors/cyan))
  ([shade] #?(:cljs (gobj/get colors/cyan shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn deep-orange
  ([] #?(:cljs colors/deepOrange))
  ([shade] #?(:cljs (gobj/get colors/deepOrange shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn deep-purple
  ([] #?(:cljs colors/deepPurple))
  ([shade] #?(:cljs (gobj/get colors/deepPurple shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn green
  ([] #?(:cljs colors/green))
  ([shade] #?(:cljs (gobj/get colors/green shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn grey
  ([] #?(:cljs colors/grey))
  ([shade] #?(:cljs (gobj/get colors/grey shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn indigo
  ([] #?(:cljs colors/indigo))
  ([shade] #?(:cljs (gobj/get colors/indigo shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn light-blue
  ([] #?(:cljs colors/lightBlue))
  ([shade] #?(:cljs (gobj/get colors/lightBlue shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn light-green
  ([] #?(:cljs colors/lightGreen))
  ([shade] #?(:cljs (gobj/get colors/lightGreen shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn lime
  ([] #?(:cljs colors/lime))
  ([shade] #?(:cljs (gobj/get colors/lime shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn orange
  ([] #?(:cljs colors/orange))
  ([shade] #?(:cljs (gobj/get colors/orange shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn pink
  ([] #?(:cljs colors/pink))
  ([shade] #?(:cljs (gobj/get colors/pink shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn purple
  ([] #?(:cljs colors/purple))
  ([shade] #?(:cljs (gobj/get colors/purple shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn red
  ([] #?(:cljs colors/red))
  ([shade] #?(:cljs (gobj/get colors/red shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn teal
  ([] #?(:cljs colors/teal))
  ([shade] #?(:cljs (gobj/get colors/teal shade))))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn yellow
  ([] #?(:cljs colors/yellow))
  ([shade] #?(:cljs (gobj/get colors/yellow shade))))
