(ns ogbe.fulcro.mui.icons.person-pin-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PersonPinRounded" :default PersonPinRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-pin-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonPinRounded)))