(ns ogbe.fulcro.mui.icons.flood-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FloodRounded" :default FloodRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flood-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FloodRounded)))