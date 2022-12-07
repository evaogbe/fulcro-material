(ns ogbe.fulcro.mui.icons.pets-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PetsRounded" :default PetsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pets-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PetsRounded)))