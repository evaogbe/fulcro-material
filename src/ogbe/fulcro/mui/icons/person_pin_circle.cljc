(ns ogbe.fulcro.mui.icons.person-pin-circle
  #?(:cljs (:require
            ["@mui/icons-material/PersonPinCircle" :default PersonPinCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-pin-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonPinCircle)))