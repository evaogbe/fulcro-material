(ns ogbe.fulcro.mui.icons.push-pin-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PushPinSharp" :default PushPinSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-push-pin-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PushPinSharp)))