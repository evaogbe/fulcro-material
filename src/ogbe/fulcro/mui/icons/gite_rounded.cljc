(ns ogbe.fulcro.mui.icons.gite-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GiteRounded" :default GiteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gite-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GiteRounded)))