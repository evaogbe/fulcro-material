(ns ogbe.fulcro.mui.icons.person-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PersonRounded" :default PersonRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonRounded)))