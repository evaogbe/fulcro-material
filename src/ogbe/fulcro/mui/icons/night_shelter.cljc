(ns ogbe.fulcro.mui.icons.night-shelter
  #?(:cljs (:require
            ["@mui/icons-material/NightShelter" :default NightShelter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-night-shelter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NightShelter)))