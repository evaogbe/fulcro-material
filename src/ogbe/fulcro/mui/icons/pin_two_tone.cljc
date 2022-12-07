(ns ogbe.fulcro.mui.icons.pin-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PinTwoTone" :default PinTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinTwoTone)))