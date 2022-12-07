(ns ogbe.fulcro.mui.icons.push-pin-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PushPinRounded" :default PushPinRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-push-pin-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PushPinRounded)))