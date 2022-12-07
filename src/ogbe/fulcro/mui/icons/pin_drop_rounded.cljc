(ns ogbe.fulcro.mui.icons.pin-drop-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PinDropRounded" :default PinDropRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin-drop-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinDropRounded)))