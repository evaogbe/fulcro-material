(ns ogbe.fulcro.mui.icons.pets
  #?(:cljs (:require
            ["@mui/icons-material/Pets" :default Pets]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pets
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pets)))