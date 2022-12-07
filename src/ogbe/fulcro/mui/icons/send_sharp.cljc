(ns ogbe.fulcro.mui.icons.send-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SendSharp" :default SendSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-send-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SendSharp)))