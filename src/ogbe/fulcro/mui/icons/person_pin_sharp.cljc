(ns ogbe.fulcro.mui.icons.person-pin-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PersonPinSharp" :default PersonPinSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-pin-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonPinSharp)))