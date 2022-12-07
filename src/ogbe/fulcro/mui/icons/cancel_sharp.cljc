(ns ogbe.fulcro.mui.icons.cancel-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CancelSharp" :default CancelSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cancel-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CancelSharp)))