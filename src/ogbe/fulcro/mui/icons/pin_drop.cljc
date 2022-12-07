(ns ogbe.fulcro.mui.icons.pin-drop
  #?(:cljs (:require
            ["@mui/icons-material/PinDrop" :default PinDrop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin-drop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinDrop)))